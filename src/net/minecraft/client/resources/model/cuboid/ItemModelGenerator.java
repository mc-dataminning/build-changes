package net.minecraft.client.resources.model.cuboid;

import com.mojang.math.Quadrant;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.minecraft.client.renderer.block.dispatch.ModelState;
import net.minecraft.client.renderer.texture.SpriteContents;
import net.minecraft.client.resources.model.ModelBaker;
import net.minecraft.client.resources.model.ModelDebugName;
import net.minecraft.client.resources.model.UnbakedModel;
import net.minecraft.client.resources.model.geometry.BakedQuad;
import net.minecraft.client.resources.model.geometry.QuadCollection;
import net.minecraft.client.resources.model.geometry.UnbakedGeometry;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.client.resources.model.sprite.TextureSlots;
import net.minecraft.core.Direction;
import net.minecraft.resources.Identifier;
import org.joml.Vector3f;
import org.jspecify.annotations.Nullable;

public class ItemModelGenerator implements UnbakedModel {
   public static final Identifier GENERATED_ITEM_MODEL_ID = Identifier.withDefaultNamespace("builtin/generated");
   public static final List<String> LAYERS = List.of("layer0", "layer1", "layer2", "layer3", "layer4");
   private static final float MIN_Z = 7.5F;
   private static final float MAX_Z = 8.5F;
   private static final TextureSlots.Data TEXTURE_SLOTS = new TextureSlots.Data.Builder().addReference("particle", "layer0").build();
   private static final CuboidFace.UVs SOUTH_FACE_UVS = new CuboidFace.UVs(0.0F, 0.0F, 16.0F, 16.0F);
   private static final CuboidFace.UVs NORTH_FACE_UVS = new CuboidFace.UVs(16.0F, 0.0F, 0.0F, 16.0F);
   private static final float UV_SHRINK = 0.01F;
   private static final float NORTH_AND_SOUTH_FACE_INSET = 0.01F;
   private static final float LAYER_OFFSET = 0.001F;

   @Override
   public TextureSlots.Data textureSlots() {
      return TEXTURE_SLOTS;
   }

   @Override
   public UnbakedGeometry geometry() {
      return ItemModelGenerator::bake;
   }

   @Override
   public UnbakedModel.@Nullable GuiLight guiLight() {
      return UnbakedModel.GuiLight.FRONT;
   }

   private static QuadCollection bake(final TextureSlots textureSlots, final ModelBaker modelBaker, final ModelState modelState, final ModelDebugName name) {
      QuadCollection singleResult = null;
      QuadCollection.Builder builder = null;

      for (int layerIndex = 0; layerIndex < LAYERS.size(); layerIndex++) {
         String textureReference = LAYERS.get(layerIndex);
         Material material = textureSlots.getMaterial(textureReference);
         if (material == null) {
            break;
         }

         Material.Baked bakedMaterial = modelBaker.materials().get(material, name);
         QuadCollection bakedLayer = modelBaker.compute(new ItemModelGenerator.ItemLayerKey(bakedMaterial, modelState, layerIndex));
         if (builder != null) {
            builder.addAll(bakedLayer);
         } else if (singleResult != null) {
            builder = new QuadCollection.Builder();
            builder.addAll(singleResult);
            builder.addAll(bakedLayer);
            singleResult = null;
         } else {
            singleResult = bakedLayer;
         }
      }

      if (builder != null) {
         return builder.build();
      } else {
         return singleResult != null ? singleResult : QuadCollection.EMPTY;
      }
   }

   private static void bakeExtrudedSprite(
      final QuadCollection.Builder builder,
      final ModelBaker.Interner interner,
      final ModelState modelState,
      final BakedQuad.MaterialInfo materialInfo,
      final int layerIndex
   ) {
      Vector3f from = new Vector3f(0.0F, 0.0F, 7.51F);
      Vector3f to = new Vector3f(16.0F, 16.0F, 8.49F);
      builder.addUnculledFace(FaceBakery.bakeQuad(interner, from, to, SOUTH_FACE_UVS, Quadrant.R0, materialInfo, Direction.SOUTH, modelState, null));
      builder.addUnculledFace(FaceBakery.bakeQuad(interner, from, to, NORTH_FACE_UVS, Quadrant.R0, materialInfo, Direction.NORTH, modelState, null));
      bakeSideFaces(builder, interner, modelState, materialInfo, layerIndex);
   }

   private static void bakeSideFaces(
      final QuadCollection.Builder builder,
      final ModelBaker.Interner interner,
      final ModelState modelState,
      final BakedQuad.MaterialInfo materialInfo,
      final int layerIndex
   ) {
      SpriteContents sprite = materialInfo.sprite().contents();
      float xScale = 16.0F / sprite.width();
      float yScale = 16.0F / sprite.height();
      Vector3f from = new Vector3f();
      Vector3f to = new Vector3f();
      float layerOffset = 0.001F * layerIndex;
      float minZ = 7.5F - layerOffset;
      float maxZ = 8.5F + layerOffset;

      for (ItemModelGenerator.SideFace sideFace : getSideFaces(sprite)) {
         ItemModelGenerator.SideDirection sideDirection = sideFace.facing();
         float startX = sideFace.startX();
         float startY = sideFace.startY();
         float endX = sideFace.endX();
         float endY = sideFace.endY();
         float u0 = startX + 0.01F;
         float u1 = endX + 1.0F - 0.01F;
         float v0;
         float v1;
         if (sideDirection.isHorizontal()) {
            v0 = startY + 0.01F;
            v1 = endY + 1.0F - 0.01F;
         } else {
            v0 = endY + 1.0F - 0.01F;
            v1 = startY + 0.01F;
         }

         switch (sideDirection) {
            case UP:
               endX++;
               break;
            case DOWN:
               endX++;
               startY++;
               endY++;
               break;
            case LEFT:
               endY++;
               break;
            case RIGHT:
               startX++;
               endX++;
               endY++;
         }

         startX *= xScale;
         endX *= xScale;
         startY *= yScale;
         endY *= yScale;
         startX -= sideDirection.direction.getStepX() * layerOffset;
         endX -= sideDirection.direction.getStepX() * layerOffset;
         startY -= sideDirection.direction.getStepY() * layerOffset;
         endY -= sideDirection.direction.getStepY() * layerOffset;
         startY = 16.0F - startY;
         endY = 16.0F - endY;
         switch (sideDirection) {
            case UP:
               from.set(startX, startY, minZ);
               to.set(endX, startY, maxZ);
               break;
            case DOWN:
               from.set(startX, endY, minZ);
               to.set(endX, endY, maxZ);
               break;
            case LEFT:
               from.set(startX, startY, minZ);
               to.set(startX, endY, maxZ);
               break;
            case RIGHT:
               from.set(endX, startY, minZ);
               to.set(endX, endY, maxZ);
               break;
            default:
               throw new UnsupportedOperationException();
         }

         CuboidFace.UVs uvs = new CuboidFace.UVs(u0 * xScale, v0 * yScale, u1 * xScale, v1 * yScale);
         builder.addUnculledFace(FaceBakery.bakeQuad(interner, from, to, uvs, Quadrant.R0, materialInfo, sideDirection.getDirection(), modelState, null));
      }
   }

   private static List<ItemModelGenerator.SideFace> getSideFaces(final SpriteContents sprite) {
      int width = sprite.width();
      int height = sprite.height();
      Set<ItemModelGenerator.SideFace> sideFaces = new HashSet<>();
      ItemModelGenerator.FaceBuilder topFace = new ItemModelGenerator.FaceBuilder(ItemModelGenerator.SideDirection.UP, sideFaces);
      ItemModelGenerator.FaceBuilder bottomFace = new ItemModelGenerator.FaceBuilder(ItemModelGenerator.SideDirection.DOWN, sideFaces);
      ItemModelGenerator.FaceBuilder leftFace = new ItemModelGenerator.FaceBuilder(ItemModelGenerator.SideDirection.LEFT, sideFaces);
      ItemModelGenerator.FaceBuilder rightFace = new ItemModelGenerator.FaceBuilder(ItemModelGenerator.SideDirection.RIGHT, sideFaces);
      BitSet leftEdges = new BitSet(width * height);
      BitSet rightEdges = new BitSet(width * height);
      sprite.getUniqueFrames().forEach(frame -> {
         leftEdges.clear();
         rightEdges.clear();
         addTopAndBottomFaces(sprite, frame, topFace, bottomFace, leftEdges, rightEdges);
         addLeftAndRightFaces(sprite, leftFace, rightFace, leftEdges, rightEdges);
      });
      return List.copyOf(sideFaces);
   }

   private static void addTopAndBottomFaces(
      final SpriteContents sprite,
      final int frame,
      final ItemModelGenerator.FaceBuilder topFace,
      final ItemModelGenerator.FaceBuilder bottomFace,
      final BitSet leftEdges,
      final BitSet rightEdges
   ) {
      int width = sprite.width();
      int height = sprite.height();

      for (int y = 0; y < height; y++) {
         boolean leftOpaque = false;

         for (int x = 0; x < width; x++) {
            boolean thisOpaque = !isTransparent(sprite, frame, x, y, width, height);
            topFace.markEdge(x, y, thisOpaque && isNeighborTransparent(ItemModelGenerator.SideDirection.UP, sprite, frame, x, y, width, height));
            bottomFace.markEdge(x, y, thisOpaque && isNeighborTransparent(ItemModelGenerator.SideDirection.DOWN, sprite, frame, x, y, width, height));
            if (leftOpaque != thisOpaque) {
               if (thisOpaque) {
                  leftEdges.set(x + y * width);
               } else {
                  rightEdges.set(x - 1 + y * width);
               }

               leftOpaque = thisOpaque;
            }
         }

         if (leftOpaque) {
            rightEdges.set(width - 1 + y * width);
         }

         topFace.flush();
         bottomFace.flush();
      }
   }

   private static void addLeftAndRightFaces(
      final SpriteContents sprite,
      final ItemModelGenerator.FaceBuilder leftFace,
      final ItemModelGenerator.FaceBuilder rightFace,
      final BitSet leftEdges,
      final BitSet rightEdges
   ) {
      int width = sprite.width();
      int height = sprite.height();

      for (int x = 0; x < width; x++) {
         for (int y = 0; y < height; y++) {
            int index = x + y * width;
            leftFace.markEdge(x, y, leftEdges.get(index));
            rightFace.markEdge(x, y, rightEdges.get(index));
         }

         leftFace.flush();
         rightFace.flush();
      }
   }

   private static boolean isNeighborTransparent(
      final ItemModelGenerator.SideDirection facing, final SpriteContents sprite, final int frame, final int x, final int y, final int width, final int height
   ) {
      return isTransparent(sprite, frame, x - facing.direction.getStepX(), y - facing.direction.getStepY(), width, height);
   }

   private static boolean isTransparent(final SpriteContents sprite, final int frame, final int x, final int y, final int width, final int height) {
      return x >= 0 && y >= 0 && x < width && y < height ? sprite.isTransparent(frame, x, y) : true;
   }

   private static class FaceBuilder {
      private final ItemModelGenerator.SideDirection direction;
      private final Collection<ItemModelGenerator.SideFace> output;
      private int startX;
      private int startY;
      private int length;

      private FaceBuilder(final ItemModelGenerator.SideDirection direction, final Collection<ItemModelGenerator.SideFace> output) {
         this.direction = direction;
         this.output = output;
      }

      public void markEdge(final int x, final int y, final boolean edge) {
         if (edge) {
            if (this.length == 0) {
               this.startX = x;
               this.startY = y;
            }

            this.length++;
         } else {
            this.flush();
         }
      }

      public void flush() {
         if (this.length != 0) {
            boolean horizontal = this.direction.isHorizontal();
            this.output
               .add(
                  new ItemModelGenerator.SideFace(
                     this.direction,
                     this.startX,
                     this.startY,
                     horizontal ? this.startX + this.length - 1 : this.startX,
                     horizontal ? this.startY : this.startY + this.length - 1
                  )
               );
            this.length = 0;
         }
      }
   }

   private record ItemLayerKey(Material.Baked material, ModelState modelState, int layerIndex) implements ModelBaker.SharedOperationKey<QuadCollection> {
      public QuadCollection compute(final ModelBaker modelBakery) {
         QuadCollection.Builder builder = new QuadCollection.Builder();
         BakedQuad.MaterialInfo materialInfo = modelBakery.interner()
            .materialInfo(BakedQuad.MaterialInfo.of(this.material, this.material.sprite().transparency(), this.layerIndex, null, 0));
         ItemModelGenerator.bakeExtrudedSprite(builder, modelBakery.interner(), this.modelState, materialInfo, this.layerIndex);
         return builder.build();
      }
   }

   private enum SideDirection {
      UP(Direction.UP),
      DOWN(Direction.DOWN),
      LEFT(Direction.EAST),
      RIGHT(Direction.WEST);

      private final Direction direction;

      SideDirection(final Direction direction) {
         this.direction = direction;
      }

      public Direction getDirection() {
         return this.direction;
      }

      private boolean isHorizontal() {
         return this == DOWN || this == UP;
      }
   }

   private record SideFace(ItemModelGenerator.SideDirection facing, int startX, int startY, int endX, int endY) {
   }
}
