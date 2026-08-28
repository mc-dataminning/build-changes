import com.google.common.base.Suppliers;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class hgz implements hhf {
   private final List<fsa> a;
   private final List<gst> b;
   private final Supplier<Vector3f[]> c;
   private final hhk d;

   public hgz(List<fsa> $$0, List<gst> $$1, hhk $$2) {
      this.a = $$0;
      this.b = $$1;
      this.d = $$2;
      this.c = Suppliers.memoize(() -> a(this.b));
   }

   public static Vector3f[] a(List<gst> $$0) {
      Set<Vector3f> $$1 = new HashSet<>();

      for (gst $$2 : $$0) {
         gtb.a($$2.b(), $$1::add);
      }

      return $$1.toArray(Vector3f[]::new);
   }

   @Override
   public void a(hhi $$0, dak $$1, hhg $$2, dai $$3, @Nullable glo $$4, @Nullable byf $$5, int $$6) {
      hhi.b $$7 = $$0.a();
      if ($$1.C()) {
         $$7.a(a($$1) ? hhi.a.c : hhi.a.b);
      }

      int $$8 = this.a.size();
      int[] $$9 = $$7.a($$8);

      for (int $$10 = 0; $$10 < $$8; $$10++) {
         $$9[$$10] = this.a.get($$10).a($$1, $$4, $$5);
      }

      $$7.a(this.c);
      $$7.a(grf.a($$1));
      this.d.a($$7, $$3);
      $$7.b().addAll(this.b);
   }

   private static boolean a(dak $$0) {
      return $$0.a(axv.bv) || $$0.a(dao.se);
   }

   public static record a(alr b, List<fsa> c) implements hhf.b {
      public static final MapCodec<hgz.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(alr.a.fieldOf("model").forGetter(hgz.a::b), fsb.a.listOf().optionalFieldOf("tints", List.of()).forGetter(hgz.a::c))
               .apply($$0, hgz.a::new)
      );

      @Override
      public void a(hnh.a $$0) {
         $$0.markDependency(this.b);
      }

      @Override
      public hhf a(hhf.a $$0) {
         hmz $$1 = $$0.a();
         hni $$2 = $$1.a(this.b);
         gti $$3 = $$2.g();
         List<gst> $$4 = $$2.a($$3, $$1, hmr.a).a();
         hhk $$5 = hhk.a($$1, $$2, $$3);
         return new hgz(this.c, $$4, $$5);
      }

      @Override
      public MapCodec<hgz.a> a() {
         return a;
      }
   }
}
