package com.example.lab4_masterdetailflow.dummy

import java.util.*

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object SKurDatastore {

    /**
     * An array of sample (dummy) items.
     */
    val ITEMS: MutableList<MyRecipe> = ArrayList()
    //Date() d = new

    /**
     * A map of sample (dummy) items, by ID.
     */
    val ITEM_MAP: MutableMap<String, MyRecipe> = HashMap()

    // create 20 items
    private val COUNT = 20

    init {
        // Add some sample items.
        for (i in 1..COUNT) {
            addItem(createMyRecipe(i))
        }
    }

    private fun addItem(item: MyRecipe) {
        ITEMS.add(item)
        ITEM_MAP.put(item.id, item)
    }

    private fun createMyRecipe(position: Int): MyRecipe {
        return MyRecipe(position.toString(), "Shrimp Pasta", 20, "shrimp",
                "Grill the shrimp and add the garlic", 75)
    }

    private fun makeDetails(position: Int): String {
        val builder = StringBuilder()
        builder.append("Details about Item: ").append(position)
        for (i in 0 until position - 1) {
            builder.append("\nMore details information here.")
        }
        return builder.toString()
    }

    /**
     * A dummy item representing a piece of content.
     */
    data class MyRecipe(val id: String, val title: String, val prepTime: Int,
                        val ingredients: String, val details: String, val hearts: Int) {

        override fun toString(): String {
            //return id + " " + prepTime + " " + ingredients + " " + details
            return "$id $prepTime $ingredients $details $hearts%"
        }
    }
}
