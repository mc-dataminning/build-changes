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
      dzl $$2 = $$0.a($$1, dzl.class);
      $$2.j();
      $$0.e(() -> {
         List<iv> $$1x = this.a($$0, ece.d);
         if ($$1x.isEmpty()) {
            $$0.b(wy.a("test_block.error.missing", ece.d.a()));
         }

         boolean $$2x = $$1x.stream().map($$1xx -> $$0.a($$1xx, dzl.class)).anyMatch(dzl::s);
         if ($$2x) {
            $$0.e();
         } else {
            this.a($$0, ece.c, $$1xx -> $$0.b(wy.b($$1xx.t())));
            this.a($$0, ece.b, dzl::j);
         }
      });
   }

   private void a(sp $$0, ece $$1, Consumer<dzl> $$2) {
      for (iv $$4 : this.a($$0, $$1)) {
         dzl $$5 = $$0.a($$4, dzl.class);
         if ($$5.s()) {
            $$2.accept($$5);
            $$5.f();
         }
      }
   }

   private iv b(sp $$0) {
      List<iv> $$1 = this.a($$0, ece.a);
      if ($$1.isEmpty()) {
         $$0.b(wy.a("test_block.error.missing", ece.a.a()));
      }

      if ($$1.size() != 1) {
         $$0.b(wy.a("test_block.error.too_many", ece.a.a()));
      }

      return $$1.getFirst();
   }

   private List<iv> a(sp $$0, ece $$1) {
      List<iv> $$2 = new ArrayList<>();
      $$0.a($$3 -> {
         eat $$4 = $$0.a($$3);
         if ($$4.a(dmt.pI) && $$4.c(dvl.b) == $$1) {
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
   protected xm b() {
      return wy.c("test_instance.type.block_based");
   }
}
