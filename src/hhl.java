import com.google.common.base.Suppliers;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class hhl implements hhr {
   private final List<fsp> a;
   private final List<gti> b;
   private final Supplier<Vector3f[]> c;
   private final hhw d;

   public hhl(List<fsp> $$0, List<gti> $$1, hhw $$2) {
      this.a = $$0;
      this.b = $$1;
      this.d = $$2;
      this.c = Suppliers.memoize(() -> a(this.b));
   }

   public static Vector3f[] a(List<gti> $$0) {
      Set<Vector3f> $$1 = new HashSet<>();

      for (gti $$2 : $$0) {
         gtq.a($$2.b(), $$1::add);
      }

      return $$1.toArray(Vector3f[]::new);
   }

   @Override
   public void a(hhu $$0, daa $$1, hhs $$2, czy $$3, @Nullable gmd $$4, @Nullable bxw $$5, int $$6) {
      hhu.b $$7 = $$0.a();
      if ($$1.C()) {
         $$7.a(a($$1) ? hhu.a.c : hhu.a.b);
      }

      int $$8 = this.a.size();
      int[] $$9 = $$7.a($$8);

      for (int $$10 = 0; $$10 < $$8; $$10++) {
         $$9[$$10] = this.a.get($$10).a($$1, $$4, $$5);
      }

      $$7.a(this.c);
      $$7.a(gru.a($$1));
      this.d.a($$7, $$3);
      $$7.b().addAll(this.b);
   }

   private static boolean a(daa $$0) {
      return $$0.a(axo.bv) || $$0.a(dae.se);
   }

   public static record a(alk b, List<fsp> c) implements hhr.b {
      public static final MapCodec<hhl.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(alk.a.fieldOf("model").forGetter(hhl.a::b), fsq.a.listOf().optionalFieldOf("tints", List.of()).forGetter(hhl.a::c))
               .apply($$0, hhl.a::new)
      );

      @Override
      public void a(hnt.a $$0) {
         $$0.markDependency(this.b);
      }

      @Override
      public hhr a(hhr.a $$0) {
         hnl $$1 = $$0.a();
         hnu $$2 = $$1.a(this.b);
         gtx $$3 = $$2.g();
         List<gti> $$4 = $$2.a($$3, $$1, hnd.a).a();
         hhw $$5 = hhw.a($$1, $$2, $$3);
         return new hhl(this.c, $$4, $$5);
      }

      @Override
      public MapCodec<hhl.a> a() {
         return a;
      }
   }
}
