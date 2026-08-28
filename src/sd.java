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
      eai $$2 = $$0.a($$1, eai.class);
      $$2.j();
      $$0.e(() -> {
         List<iw> $$1x = this.a($$0, edb.d);
         if ($$1x.isEmpty()) {
            $$0.b(xg.a("test_block.error.missing", edb.d.a()));
         }

         boolean $$2x = $$1x.stream().map($$1xx -> $$0.a($$1xx, eai.class)).anyMatch(eai::s);
         if ($$2x) {
            $$0.e();
         } else {
            this.a($$0, edb.c, $$1xx -> $$0.b(xg.b($$1xx.t())));
            this.a($$0, edb.b, eai::j);
         }
      });
   }

   private void a(sq $$0, edb $$1, Consumer<eai> $$2) {
      for (iw $$4 : this.a($$0, $$1)) {
         eai $$5 = $$0.a($$4, eai.class);
         if ($$5.s()) {
            $$2.accept($$5);
            $$5.f();
         }
      }
   }

   private iw b(sq $$0) {
      List<iw> $$1 = this.a($$0, edb.a);
      if ($$1.isEmpty()) {
         $$0.b(xg.a("test_block.error.missing", edb.a.a()));
      }

      if ($$1.size() != 1) {
         $$0.b(xg.a("test_block.error.too_many", edb.a.a()));
      }

      return $$1.getFirst();
   }

   private List<iw> a(sq $$0, edb $$1) {
      List<iw> $$2 = new ArrayList<>();
      $$0.a($$3 -> {
         ebq $$4 = $$0.a($$3);
         if ($$4.a(dnq.pI) && $$4.c(dwi.b) == $$1) {
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
   protected xu b() {
      return xg.c("test_instance.type.block_based");
   }
}
