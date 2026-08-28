import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class hbc implements hbh {
   private final hgm a;
   private final List<fmr> b;

   hbc(hgm $$0, List<fmr> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(hbk $$0, cwn $$1, hbi $$2, cwl $$3, @Nullable gfw $$4, @Nullable bvf $$5, int $$6) {
      hbk.b $$7 = $$0.a();
      if ($$1.C()) {
         $$7.a(a($$1) ? hbk.a.c : hbk.a.b);
      }

      int $$8 = this.b.size();
      int[] $$9 = $$7.a($$8);

      for (int $$10 = 0; $$10 < $$8; $$10++) {
         $$9[$$10] = this.b.get($$10).a($$1);
      }

      gmf $$11 = glo.a($$1);
      $$7.a(this.a, $$11);
   }

   private static boolean a(cwn $$0) {
      return $$0.a(awx.bt) || $$0.a(cwr.rT);
   }

   public static record a(aku b, List<fmr> c) implements hbh.b {
      public static final MapCodec<hbc.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(aku.a.fieldOf("model").forGetter(hbc.a::b), fms.a.listOf().optionalFieldOf("tints", List.of()).forGetter(hbc.a::c))
               .apply($$0, hbc.a::new)
      );

      @Override
      public void a(hhe.a $$0) {
         $$0.a(this.b);
      }

      @Override
      public hbh a(hbh.a $$0) {
         hgm $$1 = $$0.a(this.b);
         return new hbc($$1, this.c);
      }

      @Override
      public MapCodec<hbc.a> a() {
         return a;
      }
   }
}
