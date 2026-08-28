import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class gof implements brv {
   private final goy a;
   private final Set<brt> b = new ObjectOpenHashSet();
   private final bsb c = new bsb();

   public gof(LongSupplier $$0, goy $$1) {
      this.a = $$1;
      this.b.add(bsc.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bsc.a());
      this.b.add(brt.a("totalChunks", brs.f, this.a, goy::h));
      this.b.add(brt.a("renderedChunks", brs.f, this.a, goy::j));
      this.b.add(brt.a("lastViewDistance", brs.f, this.a, goy::i));
      gss $$0 = this.a.g();
      this.b.add(brt.a("toUpload", brs.g, $$0, gss::c));
      this.b.add(brt.a("freeBufferCount", brs.g, $$0, gss::d));
      this.b.add(brt.a("toBatchCount", brs.g, $$0, gss::b));
      if (fij.a().isPresent()) {
         this.b.add(brt.a("gpuUtilization", brs.i, fof.Q(), fof::v));
      }
   }

   @Override
   public Set<brt> a(Supplier<bqg> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
