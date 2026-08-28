import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class sc extends sr {
   public static final MapCodec<sc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(tk.a.forGetter(sr::n)).apply($$0, sc::new));

   public sc(tk<jf<tl>> $$0) {
      super($$0);
   }

   @Override
   public void a(sp $$0) {
      iv $$1 = this.b($$0);
      dzw $$2 = $$0.a($$1, dzw.class);
      $$2.j();
      $$0.e(() -> {
         List<iv> $$1x = this.a($$0, ecp.d);
         if ($$1x.isEmpty()) {
            $$0.b(xa.a("test_block.error.missing", ecp.d.a()));
         }

         boolean $$2x = $$1x.stream().map($$1xx -> $$0.a($$1xx, dzw.class)).anyMatch(dzw::s);
         if ($$2x) {
            $$0.e();
         } else {
            this.a($$0, ecp.c, $$1xx -> $$0.b(xa.b($$1xx.t())));
            this.a($$0, ecp.b, dzw::j);
         }
      });
   }

   private void a(sp $$0, ecp $$1, Consumer<dzw> $$2) {
      for (iv $$4 : this.a($$0, $$1)) {
         dzw $$5 = $$0.a($$4, dzw.class);
         if ($$5.s()) {
            $$2.accept($$5);
            $$5.f();
         }
      }
   }

   private iv b(sp $$0) {
      List<iv> $$1 = this.a($$0, ecp.a);
      if ($$1.isEmpty()) {
         $$0.b(xa.a("test_block.error.missing", ecp.a.a()));
      }

      if ($$1.size() != 1) {
         $$0.b(xa.a("test_block.error.too_many", ecp.a.a()));
      }

      return $$1.getFirst();
   }

   private List<iv> a(sp $$0, ecp $$1) {
      List<iv> $$2 = new ArrayList<>();
      $$0.a($$3 -> {
         ebe $$4 = $$0.a($$3);
         if ($$4.a(dne.pI) && $$4.c(dvw.b) == $$1) {
            $$2.add($$3.j());
         }
      });
      return $$2;
   }

   @Override
   public MapCodec<sc> a() {
      return a;
   }

   @Override
   protected xo b() {
      return xa.c("test_instance.type.block_based");
   }
}
