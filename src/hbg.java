import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class hbg implements hbm {
   private final hgt a;
   private final List<fmu> b;

   hbg(hgt $$0, List<fmu> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(hbp $$0, cwq $$1, hbn $$2, cwo $$3, @Nullable gga $$4, @Nullable bvi $$5, int $$6) {
      hbp.b $$7 = $$0.a();
      if ($$1.C()) {
         $$7.a(a($$1) ? hbp.a.c : hbp.a.b);
      }

      int $$8 = this.b.size();
      int[] $$9 = $$7.a($$8);

      for (int $$10 = 0; $$10 < $$8; $$10++) {
         $$9[$$10] = this.b.get($$10).a($$1, $$4, $$5);
      }

      gmj $$11 = gls.a($$1);
      $$7.a(this.a, $$11);
   }

   private static boolean a(cwq $$0) {
      return $$0.a(awy.bt) || $$0.a(cwu.rT);
   }

   public static record a(akv b, List<fmu> c) implements hbm.b {
      public static final MapCodec<hbg.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(akv.a.fieldOf("model").forGetter(hbg.a::b), fmv.a.listOf().optionalFieldOf("tints", List.of()).forGetter(hbg.a::c))
               .apply($$0, hbg.a::new)
      );

      @Override
      public void a(hhl.a $$0) {
         $$0.a(this.b);
      }

      @Override
      public hbm a(hbm.a $$0) {
         hgt $$1 = $$0.a(this.b);
         return new hbg($$1, this.c);
      }

      @Override
      public MapCodec<hbg.a> a() {
         return a;
      }
   }
}
