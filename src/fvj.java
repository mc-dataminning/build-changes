import com.google.common.annotations.VisibleForTesting;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.bytes.ByteArrayList;
import it.unimi.dsi.fastutil.bytes.ByteList;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.IntBuffer;
import java.util.List;
import java.util.function.Function;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import javax.annotation.Nullable;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;

public class fvj implements fhb {
   static final Logger b = LogUtils.getLogger();
   private static final int c = 16;
   private static final int d = 2;
   private static final int e = 32;
   private static final int f = 64;
   private static final int g = 96;
   private static final int h = 128;
   private final fur<fvj.d> i;

   fvj(fur<fvj.d> $$0) {
      this.i = $$0;
   }

   @Nullable
   @Override
   public fha a(int $$0) {
      return this.i.a($$0);
   }

   @Override
   public IntSet a() {
      return this.i.b();
   }

   @VisibleForTesting
   static void a(IntBuffer $$0, int $$1, int $$2, int $$3) {
      int $$4 = 32 - $$2 - 1;
      int $$5 = 32 - $$3 - 1;

      for (int $$6 = $$4; $$6 >= $$5; $$6--) {
         if ($$6 < 32 && $$6 >= 0) {
            boolean $$7 = ($$1 >> $$6 & 1) != 0;
            $$0.put($$7 ? -1 : 0);
         } else {
            $$0.put(0);
         }
      }
   }

   static void a(IntBuffer $$0, fvj.f $$1, int $$2, int $$3) {
      for (int $$4 = 0; $$4 < 16; $$4++) {
         int $$5 = $$1.a($$4);
         a($$0, $$5, $$2, $$3);
      }
   }

   @VisibleForTesting
   static void a(InputStream $$0, fvj.h $$1) throws IOException {
      int $$2 = 0;
      ByteList $$3 = new ByteArrayList(128);

      while (true) {
         boolean $$4 = a($$0, $$3, 58);
         int $$5 = $$3.size();
         if ($$5 == 0 && !$$4) {
            return;
         }

         if (!$$4 || $$5 != 4 && $$5 != 5 && $$5 != 6) {
            throw new IllegalArgumentException("Invalid entry at line " + $$2 + ": expected 4, 5 or 6 hex digits followed by a colon");
         }

         int $$6 = 0;

         for (int $$7 = 0; $$7 < $$5; $$7++) {
            $$6 = $$6 << 4 | a($$2, $$3.getByte($$7));
         }

         $$3.clear();
         a($$0, $$3, 10);
         int $$8 = $$3.size();

         fvj.f $$9 = switch ($$8) {
            case 32 -> fvj.a.a($$2, $$3);
            case 64 -> fvj.i.a($$2, $$3);
            case 96 -> fvj.e.b($$2, $$3);
            case 128 -> fvj.e.a($$2, $$3);
            default -> throw new IllegalArgumentException(
            "Invalid entry at line " + $$2 + ": expected hex number describing (8,16,24,32) x 16 bitmap, followed by a new line"
         );
         };
         $$1.accept($$6, $$9);
         $$2++;
         $$3.clear();
      }
   }

   static int a(int $$0, ByteList $$1, int $$2) {
      return a($$0, $$1.getByte($$2));
   }

   private static int a(int $$0, byte $$1) {
      return switch ($$1) {
         case 48 -> 0;
         case 49 -> 1;
         case 50 -> 2;
         case 51 -> 3;
         case 52 -> 4;
         case 53 -> 5;
         case 54 -> 6;
         case 55 -> 7;
         case 56 -> 8;
         case 57 -> 9;
         default -> throw new IllegalArgumentException("Invalid entry at line " + $$0 + ": expected hex digit, got " + (char)$$1);
         case 65 -> 10;
         case 66 -> 11;
         case 67 -> 12;
         case 68 -> 13;
         case 69 -> 14;
         case 70 -> 15;
      };
   }

   private static boolean a(InputStream $$0, ByteList $$1, int $$2) throws IOException {
      while (true) {
         int $$3 = $$0.read();
         if ($$3 == -1) {
            return false;
         }

         if ($$3 == $$2) {
            return true;
         }

         $$1.add((byte)$$3);
      }
   }

   static record a(byte[] a) implements fvj.f {
      @Override
      public int a(int $$0) {
         return this.a[$$0] << 24;
      }

      static fvj.f a(int $$0, ByteList $$1) {
         byte[] $$2 = new byte[16];
         int $$3 = 0;

         for (int $$4 = 0; $$4 < 16; $$4++) {
            int $$5 = fvj.a($$0, $$1, $$3++);
            int $$6 = fvj.a($$0, $$1, $$3++);
            byte $$7 = (byte)($$5 << 4 | $$6);
            $$2[$$4] = $$7;
         }

         return new fvj.a($$2);
      }

      @Override
      public int a() {
         return 8;
      }

      public byte[] b() {
         return this.a;
      }
   }

   public static class b implements fvf {
      public static final MapCodec<fvj.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(alg.a.fieldOf("hex_file").forGetter($$0x -> $$0x.c), fvj.g.a.listOf().fieldOf("size_overrides").forGetter($$0x -> $$0x.d))
               .apply($$0, fvj.b::new)
      );
      private final alg c;
      private final List<fvj.g> d;

      private b(alg $$0, List<fvj.g> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public fvg a() {
         return fvg.d;
      }

      @Override
      public Either<fvf.b, fvf.c> b() {
         return Either.left(this::a);
      }

      private fhb a(avd $$0) throws IOException {
         fvj var3;
         try (InputStream $$1 = $$0.open(this.c)) {
            var3 = this.a($$1);
         }

         return var3;
      }

      private fvj a(InputStream $$0) throws IOException {
         fur<fvj.f> $$1 = new fur<>(fvj.f[]::new, fvj.f[][]::new);
         fvj.h $$2 = $$1::a;

         fvj var17;
         try (ZipInputStream $$3 = new ZipInputStream($$0)) {
            ZipEntry $$4;
            while (($$4 = $$3.getNextEntry()) != null) {
               String $$5 = $$4.getName();
               if ($$5.endsWith(".hex")) {
                  fvj.b.info("Found {}, loading", $$5);
                  fvj.a(new ayv($$3), $$2);
               }
            }

            fur<fvj.d> $$6 = new fur<>(fvj.d[]::new, fvj.d[][]::new);

            for (fvj.g $$7 : this.d) {
               int $$8 = $$7.b;
               int $$9 = $$7.c;
               fvj.c $$10 = $$7.d;

               for (int $$11 = $$8; $$11 <= $$9; $$11++) {
                  fvj.f $$12 = $$1.b($$11);
                  if ($$12 != null) {
                     $$6.a($$11, new fvj.d($$12, $$10.c, $$10.d));
                  }
               }
            }

            $$1.a(($$1x, $$2x) -> {
               int $$3x = $$2x.d();
               int $$4x = fvj.c.a($$3x);
               int $$5 = fvj.c.b($$3x);
               $$6.a($$1x, new fvj.d($$2x, $$4x, $$5));
            });
            var17 = new fvj($$6);
         }

         return var17;
      }
   }

   public static record c(int c, int d) {
      public static final MapCodec<fvj.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.INT.fieldOf("left").forGetter(fvj.c::b), Codec.INT.fieldOf("right").forGetter(fvj.c::c)).apply($$0, fvj.c::new)
      );
      public static final Codec<fvj.c> b = a.codec();

      public int a() {
         return a(this.c, this.d);
      }

      public static int a(int $$0, int $$1) {
         return ($$0 & 0xFF) << 8 | $$1 & 0xFF;
      }

      public static int a(int $$0) {
         return (byte)($$0 >> 8);
      }

      public static int b(int $$0) {
         return (byte)$$0;
      }

      public int b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }

   static record d(fvj.f a, int b, int c) implements fha {

      public int c() {
         return this.c - this.b + 1;
      }

      @Override
      public float getAdvance() {
         return (float)(this.c() / 2 + 1);
      }

      @Override
      public float b() {
         return 0.5F;
      }

      @Override
      public float a() {
         return 0.5F;
      }

      @Override
      public fuy bake(Function<fhc, fuy> $$0) {
         return $$0.apply(new fhc() {
            @Override
            public float d() {
               return 2.0F;
            }

            @Override
            public int a() {
               return d.this.c();
            }

            @Override
            public int b() {
               return 16;
            }

            @Override
            public void a(int $$0, int $$1) {
               IntBuffer $$2 = MemoryUtil.memAllocInt(d.this.c() * 16);
               fvj.a($$2, d.this.a, d.this.b, d.this.c);
               $$2.rewind();
               GlStateManager.upload(0, $$0, $$1, d.this.c(), 16, fic.a.a, $$2, MemoryUtil::memFree);
            }

            @Override
            public boolean c() {
               return true;
            }
         });
      }

      public fvj.f d() {
         return this.a;
      }

      public int e() {
         return this.b;
      }

      public int f() {
         return this.c;
      }
   }

   static record e(int[] a, int b) implements fvj.f {
      private static final int c = 24;

      @Override
      public int a(int $$0) {
         return this.a[$$0];
      }

      static fvj.f b(int $$0, ByteList $$1) {
         int[] $$2 = new int[16];
         int $$3 = 0;
         int $$4 = 0;

         for (int $$5 = 0; $$5 < 16; $$5++) {
            int $$6 = fvj.a($$0, $$1, $$4++);
            int $$7 = fvj.a($$0, $$1, $$4++);
            int $$8 = fvj.a($$0, $$1, $$4++);
            int $$9 = fvj.a($$0, $$1, $$4++);
            int $$10 = fvj.a($$0, $$1, $$4++);
            int $$11 = fvj.a($$0, $$1, $$4++);
            int $$12 = $$6 << 20 | $$7 << 16 | $$8 << 12 | $$9 << 8 | $$10 << 4 | $$11;
            $$2[$$5] = $$12 << 8;
            $$3 |= $$12;
         }

         return new fvj.e($$2, 24);
      }

      public static fvj.f a(int $$0, ByteList $$1) {
         int[] $$2 = new int[16];
         int $$3 = 0;
         int $$4 = 0;

         for (int $$5 = 0; $$5 < 16; $$5++) {
            int $$6 = fvj.a($$0, $$1, $$4++);
            int $$7 = fvj.a($$0, $$1, $$4++);
            int $$8 = fvj.a($$0, $$1, $$4++);
            int $$9 = fvj.a($$0, $$1, $$4++);
            int $$10 = fvj.a($$0, $$1, $$4++);
            int $$11 = fvj.a($$0, $$1, $$4++);
            int $$12 = fvj.a($$0, $$1, $$4++);
            int $$13 = fvj.a($$0, $$1, $$4++);
            int $$14 = $$6 << 28 | $$7 << 24 | $$8 << 20 | $$9 << 16 | $$10 << 12 | $$11 << 8 | $$12 << 4 | $$13;
            $$2[$$5] = $$14;
            $$3 |= $$14;
         }

         return new fvj.e($$2, 32);
      }

      public int[] b() {
         return this.a;
      }

      @Override
      public int a() {
         return this.b;
      }
   }

   public interface f {
      int a(int var1);

      int a();

      default int c() {
         int $$0 = 0;

         for (int $$1 = 0; $$1 < 16; $$1++) {
            $$0 |= this.a($$1);
         }

         return $$0;
      }

      default int d() {
         int $$0 = this.c();
         int $$1 = this.a();
         int $$2;
         int $$3;
         if ($$0 == 0) {
            $$2 = 0;
            $$3 = $$1;
         } else {
            $$2 = Integer.numberOfLeadingZeros($$0);
            $$3 = 32 - Integer.numberOfTrailingZeros($$0) - 1;
         }

         return fvj.c.a($$2, $$3);
      }
   }

   static record g(int b, int c, fvj.c d) {
      private static final Codec<fvj.g> e = RecordCodecBuilder.create(
         $$0 -> $$0.group(ayu.B.fieldOf("from").forGetter(fvj.g::a), ayu.B.fieldOf("to").forGetter(fvj.g::b), fvj.c.a.forGetter(fvj.g::c))
               .apply($$0, fvj.g::new)
      );
      public static final Codec<fvj.g> a = e.validate(
         $$0 -> $$0.b >= $$0.c ? DataResult.error(() -> "Invalid range: [" + $$0.b + ";" + $$0.c + "]") : DataResult.success($$0)
      );

      public int a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }

      public fvj.c c() {
         return this.d;
      }
   }

   @FunctionalInterface
   public interface h {
      void accept(int var1, fvj.f var2);
   }

   static record i(short[] a) implements fvj.f {
      @Override
      public int a(int $$0) {
         return this.a[$$0] << 16;
      }

      static fvj.f a(int $$0, ByteList $$1) {
         short[] $$2 = new short[16];
         int $$3 = 0;

         for (int $$4 = 0; $$4 < 16; $$4++) {
            int $$5 = fvj.a($$0, $$1, $$3++);
            int $$6 = fvj.a($$0, $$1, $$3++);
            int $$7 = fvj.a($$0, $$1, $$3++);
            int $$8 = fvj.a($$0, $$1, $$3++);
            short $$9 = (short)($$5 << 12 | $$6 << 8 | $$7 << 4 | $$8);
            $$2[$$4] = $$9;
         }

         return new fvj.i($$2);
      }

      @Override
      public int a() {
         return 16;
      }

      public short[] b() {
         return this.a;
      }
   }
}
