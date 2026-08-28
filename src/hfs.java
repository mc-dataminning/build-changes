import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class hfs implements hfn {
   private static final int a = 16;
   private final hgx b;
   private final float c;
   private final float[] d;
   private final hfn[] e;
   private final hfn f;

   hfs(hgx $$0, float $$1, float[] $$2, hfn[] $$3, hfn $$4) {
      this.b = $$0;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.c = $$1;
   }

   private static int a(float[] $$0, float $$1) {
      if ($$0.length < 16) {
         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            if ($$0[$$2] > $$1) {
               return $$2 - 1;
            }
         }

         return $$0.length - 1;
      } else {
         int $$3 = Arrays.binarySearch($$0, $$1);
         if ($$3 < 0) {
            int $$4 = ~$$3;
            return $$4 - 1;
         } else {
            return $$3;
         }
      }
   }

   @Override
   public void a(hfq $$0, czd $$1, hfo $$2, czb $$3, @Nullable gjz $$4, @Nullable bxe $$5, int $$6) {
      float $$7 = this.b.a($$1, $$4, $$5, $$6) * this.c;
      hfn $$8;
      if (Float.isNaN($$7)) {
         $$8 = this.f;
      } else {
         int $$9 = a(this.d, $$7);
         $$8 = $$9 == -1 ? this.f : this.e[$$9];
      }

      $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public static record a(float c, hfn.b d) {
      public static final Codec<hfs.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("threshold").forGetter(hfs.a::a), hfp.a.fieldOf("model").forGetter(hfs.a::b)).apply($$0, hfs.a::new)
      );
      public static final Comparator<hfs.a> b = Comparator.comparingDouble(hfs.a::a);

      public float a() {
         return (double)this.c;
      }

      public hfn.b b() {
         return this.d;
      }
   }

   public static record b(hgx b, float c, List<hfs.a> d, Optional<hfn.b> e) implements hfn.b {
      public static final MapCodec<hfs.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  hgw.a.forGetter(hfs.b::b),
                  Codec.FLOAT.optionalFieldOf("scale", 1.0F).forGetter(hfs.b::c),
                  hfs.a.a.listOf().fieldOf("entries").forGetter(hfs.b::d),
                  hfp.a.optionalFieldOf("fallback").forGetter(hfs.b::e)
               )
               .apply($$0, hfs.b::new)
      );

      @Override
      public MapCodec<hfs.b> a() {
         return a;
      }

      @Override
      public hfn a(hfn.a $$0) {
         float[] $$1 = new float[this.d.size()];
         hfn[] $$2 = new hfn[this.d.size()];
         List<hfs.a> $$3 = new ArrayList<>(this.d);
         $$3.sort(hfs.a.b);

         for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
            hfs.a $$5 = $$3.get($$4);
            $$1[$$4] = $$5.c;
            $$2[$$4] = $$5.d.a($$0);
         }

         hfn $$6 = this.e.<hfn>map($$1x -> $$1x.a($$0)).orElse($$0.c());
         return new hfs(this.b, this.c, $$1, $$2, $$6);
      }

      @Override
      public void a(hlp.a $$0) {
         this.e.ifPresent($$1 -> $$1.a($$0));
         this.d.forEach($$1 -> $$1.d.a($$0));
      }
   }
}
