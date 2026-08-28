import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class heu implements hep {
   private static final int a = 16;
   private final hfz b;
   private final float c;
   private final float[] d;
   private final hep[] e;
   private final hep f;

   heu(hfz $$0, float $$1, float[] $$2, hep[] $$3, hep $$4) {
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
   public void a(hes $$0, cys $$1, heq $$2, cyq $$3, @Nullable gjd $$4, @Nullable bwz $$5, int $$6) {
      float $$7 = this.b.a($$1, $$4, $$5, $$6) * this.c;
      hep $$8;
      if (Float.isNaN($$7)) {
         $$8 = this.f;
      } else {
         int $$9 = a(this.d, $$7);
         $$8 = $$9 == -1 ? this.f : this.e[$$9];
      }

      $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public static record a(float c, hep.b d) {
      public static final Codec<heu.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("threshold").forGetter(heu.a::a), her.a.fieldOf("model").forGetter(heu.a::b)).apply($$0, heu.a::new)
      );
      public static final Comparator<heu.a> b = Comparator.comparingDouble(heu.a::a);

      public float a() {
         return (double)this.c;
      }

      public hep.b b() {
         return this.d;
      }
   }

   public static record b(hfz b, float c, List<heu.a> d, Optional<hep.b> e) implements hep.b {
      public static final MapCodec<heu.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  hfy.a.forGetter(heu.b::b),
                  Codec.FLOAT.optionalFieldOf("scale", 1.0F).forGetter(heu.b::c),
                  heu.a.a.listOf().fieldOf("entries").forGetter(heu.b::d),
                  her.a.optionalFieldOf("fallback").forGetter(heu.b::e)
               )
               .apply($$0, heu.b::new)
      );

      @Override
      public MapCodec<heu.b> a() {
         return a;
      }

      @Override
      public hep a(hep.a $$0) {
         float[] $$1 = new float[this.d.size()];
         hep[] $$2 = new hep[this.d.size()];
         List<heu.a> $$3 = new ArrayList<>(this.d);
         $$3.sort(heu.a.b);

         for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
            heu.a $$5 = $$3.get($$4);
            $$1[$$4] = $$5.c;
            $$2[$$4] = $$5.d.a($$0);
         }

         hep $$6 = this.e.<hep>map($$1x -> $$1x.a($$0)).orElse($$0.c());
         return new heu(this.b, this.c, $$1, $$2, $$6);
      }

      @Override
      public void a(hkr.a $$0) {
         this.e.ifPresent($$1 -> $$1.a($$0));
         this.d.forEach($$1 -> $$1.d.a($$0));
      }
   }
}
