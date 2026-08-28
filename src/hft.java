import com.google.common.base.Suppliers;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class hft implements hfz {
   private final List<fqy> a;
   private final List<grs> b;
   private final Supplier<Vector3f[]> c;
   private final hge d;

   public hft(List<fqy> $$0, List<grs> $$1, hge $$2) {
      this.a = $$0;
      this.b = $$1;
      this.d = $$2;
      this.c = Suppliers.memoize(() -> a(this.b));
   }

   public static Vector3f[] a(List<grs> $$0) {
      Set<Vector3f> $$1 = new HashSet<>();

      for (grs $$2 : $$0) {
         grz.a($$2.b(), $$1::add);
      }

      return $$1.toArray(Vector3f[]::new);
   }

   @Override
   public void a(hgc $$0, czk $$1, hga $$2, czi $$3, @Nullable gkl $$4, @Nullable bxj $$5, int $$6) {
      hgc.b $$7 = $$0.a();
      if ($$1.C()) {
         $$7.a(a($$1) ? hgc.a.c : hgc.a.b);
      }

      int $$8 = this.a.size();
      int[] $$9 = $$7.a($$8);

      for (int $$10 = 0; $$10 < $$8; $$10++) {
         $$9[$$10] = this.a.get($$10).a($$1, $$4, $$5);
      }

      $$7.a(this.c);
      $$7.a(gqe.a($$1));
      this.d.a($$7, $$3);
      $$7.b().addAll(this.b);
   }

   private static boolean a(czk $$0) {
      return $$0.a(axk.bu) || $$0.a(czo.se);
   }

   public static record a(alg b, List<fqy> c) implements hfz.b {
      public static final MapCodec<hft.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(alg.a.fieldOf("model").forGetter(hft.a::b), fqz.a.listOf().optionalFieldOf("tints", List.of()).forGetter(hft.a::c))
               .apply($$0, hft.a::new)
      );

      @Override
      public void a(hmb.a $$0) {
         $$0.markDependency(this.b);
      }

      @Override
      public hfz a(hfz.a $$0) {
         hls $$1 = $$0.a();
         hmc $$2 = $$1.a(this.b);
         gsg $$3 = $$2.g();
         List<grs> $$4 = $$2.a($$3, $$1, hlk.a).a();
         hge $$5 = hge.a($$1, $$2, $$3);
         return new hft(this.c, $$4, $$5);
      }

      @Override
      public MapCodec<hft.a> a() {
         return a;
      }
   }
}
