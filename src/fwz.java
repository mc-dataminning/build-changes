import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class fwz implements bla {
   private final fxq a;
   private final Set<bky> b = new ObjectOpenHashSet();
   private final blg c = new blg();

   public fwz(LongSupplier $$0, fxq $$1) {
      this.a = $$1;
      this.b.add(blh.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(blh.a());
      this.b.add(bky.a("totalChunks", bkx.f, this.a, fxq::i));
      this.b.add(bky.a("renderedChunks", bkx.f, this.a, fxq::k));
      this.b.add(bky.a("lastViewDistance", bkx.f, this.a, fxq::j));
      gas $$0 = this.a.h();
      this.b.add(bky.a("toUpload", bkx.g, $$0, gas::c));
      this.b.add(bky.a("freeBufferCount", bkx.g, $$0, gas::d));
      this.b.add(bky.a("toBatchCount", bkx.g, $$0, gas::b));
      if (etu.a().isPresent()) {
         this.b.add(bky.a("gpuUtilization", bkx.i, ezi.Q(), ezi::v));
      }
   }

   @Override
   public Set<bky> a(Supplier<bjp> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
