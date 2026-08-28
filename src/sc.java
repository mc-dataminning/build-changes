import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class sc extends sq {
   public static final MapCodec<sc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(tj.a.forGetter(sq::n)).apply($$0, sc::new));

   public sc(tj<je<tk>> $$0) {
      super($$0);
   }

   @Override
   public void a(so $$0) {
      iu $$1 = this.a($$0, eaz.a);
      dyh $$2 = $$0.a($$1, dyh.class);
      $$2.j();
      $$0.e(() -> {
         iu $$1x = this.a($$0, eaz.d);
         dyh $$2x = $$0.a($$1x, dyh.class);
         if ($$2x.s()) {
            $$0.e();
         } else {
            this.a($$0, eaz.c, $$1xx -> $$0.b(ww.b($$1xx.t())));
            this.a($$0, eaz.b, dyh::j);
         }
      });
   }

   private void a(so $$0, eaz $$1, Consumer<dyh> $$2) {
      for (iu $$4 : this.b($$0, $$1)) {
         dyh $$5 = $$0.a($$4, dyh.class);
         if ($$5.s()) {
            $$2.accept($$5);
            $$5.f();
         }
      }
   }

   private iu a(so $$0, eaz $$1) {
      List<iu> $$2 = this.b($$0, $$1);
      if ($$2.isEmpty()) {
         $$0.b(ww.a("test_block.error.missing", $$1.a()));
      }

      if ($$2.size() != 1) {
         $$0.b(ww.a("test_block.error.too_many", $$1.a()));
      }

      return $$2.getFirst();
   }

   private List<iu> b(so $$0, eaz $$1) {
      List<iu> $$2 = new ArrayList<>();
      $$0.a($$3 -> {
         dzo $$4 = $$0.a($$3);
         if ($$4.a(dlw.pE) && $$4.c(dui.b) == $$1) {
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
   protected xk b() {
      return ww.c("test_instance.type.block_based");
   }
}
