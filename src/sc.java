import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class sc extends sr {
   public static final MapCodec<sc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(tk.a.forGetter(sr::n)).apply($$0, sc::new));

   public sc(tk<je<tl>> $$0) {
      super($$0);
   }

   @Override
   public void a(sp $$0) {
      iu $$1 = this.b($$0);
      dyr $$2 = $$0.a($$1, dyr.class);
      $$2.j();
      $$0.e(() -> {
         List<iu> $$1x = this.a($$0, ebk.d);
         if ($$1x.isEmpty()) {
            $$0.b(wy.a("test_block.error.missing", ebk.d.a()));
         }

         boolean $$2x = $$1x.stream().map($$1xx -> $$0.a($$1xx, dyr.class)).anyMatch(dyr::s);
         if ($$2x) {
            $$0.e();
         } else {
            this.a($$0, ebk.c, $$1xx -> $$0.b(wy.b($$1xx.t())));
            this.a($$0, ebk.b, dyr::j);
         }
      });
   }

   private void a(sp $$0, ebk $$1, Consumer<dyr> $$2) {
      for (iu $$4 : this.a($$0, $$1)) {
         dyr $$5 = $$0.a($$4, dyr.class);
         if ($$5.s()) {
            $$2.accept($$5);
            $$5.f();
         }
      }
   }

   private iu b(sp $$0) {
      List<iu> $$1 = this.a($$0, ebk.a);
      if ($$1.isEmpty()) {
         $$0.b(wy.a("test_block.error.missing", ebk.a.a()));
      }

      if ($$1.size() != 1) {
         $$0.b(wy.a("test_block.error.too_many", ebk.a.a()));
      }

      return $$1.getFirst();
   }

   private List<iu> a(sp $$0, ebk $$1) {
      List<iu> $$2 = new ArrayList<>();
      $$0.a($$3 -> {
         dzz $$4 = $$0.a($$3);
         if ($$4.a(dmc.pF) && $$4.c(dur.b) == $$1) {
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
