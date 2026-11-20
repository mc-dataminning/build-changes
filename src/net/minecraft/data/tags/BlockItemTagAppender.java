package net.minecraft.data.tags;

import java.util.Arrays;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Group;

public abstract class BlockItemTagAppender<Element> implements TagAppender<Element> {
   private final TagAppender<Element> original;

   public BlockItemTagAppender(final TagAppender<Element> original) {
      this.original = original;
   }

   protected abstract ResourceKey<Element> convertElement(BlockItemId element);

   public BlockItemTagAppender<Element> add(final ResourceKey<Element> element) {
      this.original.add(element);
      return this;
   }

   public BlockItemTagAppender<Element> add(final BlockItemId... ids) {
      this.original.addAll(Arrays.stream(ids).map(this::convertElement));
      return this;
   }

   public BlockItemTagAppender<Element> addAll(final Group<ResourceKey<Element>> collection) {
      collection.forEach(this::add);
      return this;
   }

   public BlockItemTagAppender<Element> addAllBlockItems(final Group<BlockItemId> collection) {
      BlockItemTagAppender var2 = this;
      collection.forEach(xva$0 -> var2.add(new BlockItemId[]{xva$0}));
      return this;
   }

   @SafeVarargs
   public final BlockItemTagAppender<Element> add(final ResourceKey<Element>... elements) {
      this.original.add(elements);
      return this;
   }

   public BlockItemTagAppender<Element> addOptional(final ResourceKey<Element> element) {
      this.original.addOptional(element);
      return this;
   }

   public BlockItemTagAppender<Element> addTag(final TagKey<Element> tag) {
      this.original.addTag(tag);
      return this;
   }

   public BlockItemTagAppender<Element> addOptionalTag(final TagKey<Element> tag) {
      this.original.addOptionalTag(tag);
      return this;
   }
}
