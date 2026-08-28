import com.google.common.base.Suppliers;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class hfz implements hgf {
   private final List<frd> a;
   private final List<grx> b;
   private final Supplier<Vector3f[]> c;
   private final hgk d;

   public hfz(List<frd> $$0, List<grx> $$1, hgk $$2) {
      this.a = $$0;
      this.b = $$1;
      this.d = $$2;
      this.c = Suppliers.memoize(() -> a(this.b));
   }

   public static Vector3f[] a(List<grx> $$0) {
      Set<Vector3f> $$1 = new HashSet<>();

      for (grx $$2 : $$0) {
         gse.a($$2.b(), $$1::add);
      }

      return $$1.toArray(Vector3f[]::new);
   }

   @Override
   public void a(hgi $$0, czn $$1, hgg $$2, czl $$3, @Nullable gkq $$4, @Nullable bxj $$5, int $$6) {
      hgi.b $$7 = $$0.a();
      if ($$1.C()) {
         $$7.a(a($$1) ? hgi.a.c : hgi.a.b);
      }

      int $$8 = this.a.size();
      int[] $$9 = $$7.a($$8);

      for (int $$10 = 0; $$10 < $$8; $$10++) {
         $$9[$$10] = this.a.get($$10).a($$1, $$4, $$5);
      }

      $$7.a(this.c);
      $$7.a(gqj.a($$1));
      this.d.a($$7, $$3);
      $$7.b().addAll(this.b);
   }

   private static boolean a(czn $$0) {
      return $$0.a(axk.bu) || $$0.a(czr.se);
   }

   public static record a(alg b, List<frd> c) implements hgf.b {
      public static final MapCodec<hfz.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(alg.a.fieldOf("model").forGetter(hfz.a::b), fre.a.listOf().optionalFieldOf("tints", List.of()).forGetter(hfz.a::c))
               .apply($$0, hfz.a::new)
      );

      @Override
      public void a(hmi.a $$0) {
         $$0.markDependency(this.b);
      }

      @Override
      public hgf a(hgf.a $$0) {
         hlz $$1 = $$0.a();
         hmj $$2 = $$1.a(this.b);
         gsl $$3 = $$2.g();
         List<grx> $$4 = $$2.a($$3, $$1, hlr.a).a();
         hgk $$5 = hgk.a($$1, $$2, $$3);
         return new hfz(this.c, $$4, $$5);
      }

      @Override
      public MapCodec<hfz.a> a() {
         return a;
      }
   }
}
