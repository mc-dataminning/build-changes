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
      dyz $$2 = $$0.a($$1, dyz.class);
      $$2.j();
      $$0.e(() -> {
         List<iu> $$1x = this.a($$0, ebs.d);
         if ($$1x.isEmpty()) {
            $$0.b(wy.a("test_block.error.missing", ebs.d.a()));
         }

         boolean $$2x = $$1x.stream().map($$1xx -> $$0.a($$1xx, dyz.class)).anyMatch(dyz::s);
         if ($$2x) {
            $$0.e();
         } else {
            this.a($$0, ebs.c, $$1xx -> $$0.b(wy.b($$1xx.t())));
            this.a($$0, ebs.b, dyz::j);
         }
      });
   }

   private void a(sp $$0, ebs $$1, Consumer<dyz> $$2) {
      for (iu $$4 : this.a($$0, $$1)) {
         dyz $$5 = $$0.a($$4, dyz.class);
         if ($$5.s()) {
            $$2.accept($$5);
            $$5.f();
         }
      }
   }

   private iu b(sp $$0) {
      List<iu> $$1 = this.a($$0, ebs.a);
      if ($$1.isEmpty()) {
         $$0.b(wy.a("test_block.error.missing", ebs.a.a()));
      }

      if ($$1.size() != 1) {
         $$0.b(wy.a("test_block.error.too_many", ebs.a.a()));
      }

      return $$1.getFirst();
   }

   private List<iu> a(sp $$0, ebs $$1) {
      List<iu> $$2 = new ArrayList<>();
      $$0.a($$3 -> {
         eah $$4 = $$0.a($$3);
         if ($$4.a(dmh.pI) && $$4.c(duz.b) == $$1) {
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
