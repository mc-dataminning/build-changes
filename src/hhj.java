import com.google.common.base.Suppliers;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class hhj implements hhp {
   private final List<fsn> a;
   private final List<gtg> b;
   private final Supplier<Vector3f[]> c;
   private final hhu d;

   public hhj(List<fsn> $$0, List<gtg> $$1, hhu $$2) {
      this.a = $$0;
      this.b = $$1;
      this.d = $$2;
      this.c = Suppliers.memoize(() -> a(this.b));
   }

   public static Vector3f[] a(List<gtg> $$0) {
      Set<Vector3f> $$1 = new HashSet<>();

      for (gtg $$2 : $$0) {
         gto.a($$2.b(), $$1::add);
      }

      return $$1.toArray(Vector3f[]::new);
   }

   @Override
   public void a(hhs $$0, czy $$1, hhq $$2, czw $$3, @Nullable gmb $$4, @Nullable bxu $$5, int $$6) {
      hhs.b $$7 = $$0.a();
      if ($$1.C()) {
         $$7.a(a($$1) ? hhs.a.c : hhs.a.b);
      }

      int $$8 = this.a.size();
      int[] $$9 = $$7.a($$8);

      for (int $$10 = 0; $$10 < $$8; $$10++) {
         $$9[$$10] = this.a.get($$10).a($$1, $$4, $$5);
      }

      $$7.a(this.c);
      $$7.a(grs.a($$1));
      this.d.a($$7, $$3);
      $$7.b().addAll(this.b);
   }

   private static boolean a(czy $$0) {
      return $$0.a(axm.bu) || $$0.a(dac.se);
   }

   public static record a(ali b, List<fsn> c) implements hhp.b {
      public static final MapCodec<hhj.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ali.a.fieldOf("model").forGetter(hhj.a::b), fso.a.listOf().optionalFieldOf("tints", List.of()).forGetter(hhj.a::c))
               .apply($$0, hhj.a::new)
      );

      @Override
      public void a(hnr.a $$0) {
         $$0.markDependency(this.b);
      }

      @Override
      public hhp a(hhp.a $$0) {
         hnj $$1 = $$0.a();
         hns $$2 = $$1.a(this.b);
         gtv $$3 = $$2.g();
         List<gtg> $$4 = $$2.a($$3, $$1, hnb.a).a();
         hhu $$5 = hhu.a($$1, $$2, $$3);
         return new hhj(this.c, $$4, $$5);
      }

      @Override
      public MapCodec<hhj.a> a() {
         return a;
      }
   }
}
