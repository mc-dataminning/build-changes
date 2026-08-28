import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class hbf implements hbl {
   private final hgs a;
   private final List<fmt> b;

   hbf(hgs $$0, List<fmt> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(hbo $$0, cwp $$1, hbm $$2, cwn $$3, @Nullable gfz $$4, @Nullable bvh $$5, int $$6) {
      hbo.b $$7 = $$0.a();
      if ($$1.C()) {
         $$7.a(a($$1) ? hbo.a.c : hbo.a.b);
      }

      int $$8 = this.b.size();
      int[] $$9 = $$7.a($$8);

      for (int $$10 = 0; $$10 < $$8; $$10++) {
         $$9[$$10] = this.b.get($$10).a($$1, $$4, $$5);
      }

      gmi $$11 = glr.a($$1);
      $$7.a(this.a, $$11);
   }

   private static boolean a(cwp $$0) {
      return $$0.a(awy.bt) || $$0.a(cwt.rT);
   }

   public static record a(akv b, List<fmt> c) implements hbl.b {
      public static final MapCodec<hbf.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(akv.a.fieldOf("model").forGetter(hbf.a::b), fmu.a.listOf().optionalFieldOf("tints", List.of()).forGetter(hbf.a::c))
               .apply($$0, hbf.a::new)
      );

      @Override
      public void a(hhk.a $$0) {
         $$0.a(this.b);
      }

      @Override
      public hbl a(hbl.a $$0) {
         hgs $$1 = $$0.a(this.b);
         return new hbf($$1, this.c);
      }

      @Override
      public MapCodec<hbf.a> a() {
         return a;
      }
   }
}
