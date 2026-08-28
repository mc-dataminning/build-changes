import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class hej implements hep {
   private final hjz a;
   private final List<fpq> b;

   hej(hjz $$0, List<fpq> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(hes $$0, cys $$1, heq $$2, cyq $$3, @Nullable gjd $$4, @Nullable bwz $$5, int $$6) {
      hes.b $$7 = $$0.a();
      if ($$1.C()) {
         $$7.a(a($$1) ? hes.a.c : hes.a.b);
      }

      int $$8 = this.b.size();
      int[] $$9 = $$7.a($$8);

      for (int $$10 = 0; $$10 < $$8; $$10++) {
         $$9[$$10] = this.b.get($$10).a($$1, $$4, $$5);
      }

      gpn $$11 = gov.a($$1);
      $$7.a(this.a, $$11);
   }

   private static boolean a(cys $$0) {
      return $$0.a(axi.bt) || $$0.a(cyw.rX);
   }

   public static record a(ale b, List<fpq> c) implements hep.b {
      public static final MapCodec<hej.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ale.a.fieldOf("model").forGetter(hej.a::b), fpr.a.listOf().optionalFieldOf("tints", List.of()).forGetter(hej.a::c))
               .apply($$0, hej.a::new)
      );

      @Override
      public void a(hkr.a $$0) {
         $$0.a(this.b);
      }

      @Override
      public hep a(hep.a $$0) {
         hjz $$1 = $$0.a(this.b);
         return new hej($$1, this.c);
      }

      @Override
      public MapCodec<hej.a> a() {
         return a;
      }
   }
}
