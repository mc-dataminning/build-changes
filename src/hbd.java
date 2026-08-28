import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class hbd implements hbi {
   private final hgl a;
   private final List<fmt> b;

   hbd(hgl $$0, List<fmt> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(hbl $$0, cwp $$1, hbj $$2, cwn $$3, @Nullable gfy $$4, @Nullable bvg $$5, int $$6) {
      hbl.b $$7 = $$0.a();
      if ($$1.C()) {
         $$7.a(a($$1) ? hbl.a.c : hbl.a.b);
      }

      int $$8 = this.b.size();
      int[] $$9 = $$7.a($$8);

      for (int $$10 = 0; $$10 < $$8; $$10++) {
         $$9[$$10] = this.b.get($$10).a($$1);
      }

      gmh $$11 = glq.a($$1);
      $$7.a(this.a, $$11);
   }

   private static boolean a(cwp $$0) {
      return $$0.a(awy.bt) || $$0.a(cwt.rT);
   }

   public static record a(aku b, List<fmt> c) implements hbi.b {
      public static final MapCodec<hbd.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(aku.a.fieldOf("model").forGetter(hbd.a::b), fmu.a.listOf().optionalFieldOf("tints", List.of()).forGetter(hbd.a::c))
               .apply($$0, hbd.a::new)
      );

      @Override
      public void a(hhd.a $$0) {
         $$0.a(this.b);
      }

      @Override
      public hbi a(hbi.a $$0) {
         hgl $$1 = $$0.a(this.b);
         return new hbd($$1, this.c);
      }

      @Override
      public MapCodec<hbd.a> a() {
         return a;
      }
   }
}
