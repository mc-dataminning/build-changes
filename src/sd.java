import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class sd extends ss {
   public static final MapCodec<sd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(tl.a.forGetter(ss::n)).apply($$0, sd::new));

   public sd(tl<jg<tm>> $$0) {
      super($$0);
   }

   @Override
   public void a(sq $$0) {
      iw $$1 = this.b($$0);
      dzy $$2 = $$0.a($$1, dzy.class);
      $$2.j();
      $$0.e(() -> {
         List<iw> $$1x = this.a($$0, ecr.d);
         if ($$1x.isEmpty()) {
            $$0.b(xc.a("test_block.error.missing", ecr.d.a()));
         }

         boolean $$2x = $$1x.stream().map($$1xx -> $$0.a($$1xx, dzy.class)).anyMatch(dzy::s);
         if ($$2x) {
            $$0.e();
         } else {
            this.a($$0, ecr.c, $$1xx -> $$0.b(xc.b($$1xx.t())));
            this.a($$0, ecr.b, dzy::j);
         }
      });
   }

   private void a(sq $$0, ecr $$1, Consumer<dzy> $$2) {
      for (iw $$4 : this.a($$0, $$1)) {
         dzy $$5 = $$0.a($$4, dzy.class);
         if ($$5.s()) {
            $$2.accept($$5);
            $$5.f();
         }
      }
   }

   private iw b(sq $$0) {
      List<iw> $$1 = this.a($$0, ecr.a);
      if ($$1.isEmpty()) {
         $$0.b(xc.a("test_block.error.missing", ecr.a.a()));
      }

      if ($$1.size() != 1) {
         $$0.b(xc.a("test_block.error.too_many", ecr.a.a()));
      }

      return $$1.getFirst();
   }

   private List<iw> a(sq $$0, ecr $$1) {
      List<iw> $$2 = new ArrayList<>();
      $$0.a($$3 -> {
         ebg $$4 = $$0.a($$3);
         if ($$4.a(dng.pI) && $$4.c(dvy.b) == $$1) {
            $$2.add($$3.j());
         }
      });
      return $$2;
   }

   @Override
   public MapCodec<sd> a() {
      return a;
   }

   @Override
   protected xq b() {
      return xc.c("test_instance.type.block_based");
   }
}
