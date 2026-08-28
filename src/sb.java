import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class sb extends sp {
   public static final MapCodec<sb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ti.a.forGetter(sp::n)).apply($$0, sb::new));

   public sb(ti<js<tj>> $$0) {
      super($$0);
   }

   @Override
   public void a(sn $$0) {
      jj $$1 = this.a($$0, dzx.a);
      dxf $$2 = $$0.a($$1, dxf.class);
      $$2.j();
      $$0.e(() -> {
         jj $$1x = this.a($$0, dzx.d);
         dxf $$2x = $$0.a($$1x, dxf.class);
         if ($$2x.s()) {
            $$0.e();
         } else {
            this.a($$0, dzx.c, $$1xx -> $$0.b(wv.b($$1xx.t())));
            this.a($$0, dzx.b, dxf::j);
         }
      });
   }

   private void a(sn $$0, dzx $$1, Consumer<dxf> $$2) {
      for (jj $$4 : this.b($$0, $$1)) {
         dxf $$5 = $$0.a($$4, dxf.class);
         if ($$5.s()) {
            $$2.accept($$5);
            $$5.f();
         }
      }
   }

   private jj a(sn $$0, dzx $$1) {
      List<jj> $$2 = this.b($$0, $$1);
      if ($$2.isEmpty()) {
         $$0.b(wv.a("test_block.error.missing", $$1.a()));
      }

      if ($$2.size() != 1) {
         $$0.b(wv.a("test_block.error.too_many", $$1.a()));
      }

      return $$2.getFirst();
   }

   private List<jj> b(sn $$0, dzx $$1) {
      List<jj> $$2 = new ArrayList<>();
      $$0.a($$3 -> {
         dym $$4 = $$0.a($$3);
         if ($$4.a(dkw.pE) && $$4.c(dti.b) == $$1) {
            $$2.add($$3.j());
         }
      });
      return $$2;
   }

   @Override
   public MapCodec<sb> a() {
      return a;
   }

   @Override
   protected xj b() {
      return wv.c("test_instance.type.block_based");
   }
}
