import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class fwx implements bkz {
   private final fxo a;
   private final Set<bkx> b = new ObjectOpenHashSet();
   private final blf c = new blf();

   public fwx(LongSupplier $$0, fxo $$1) {
      this.a = $$1;
      this.b.add(blg.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(blg.a());
      this.b.add(bkx.a("totalChunks", bkw.f, this.a, fxo::i));
      this.b.add(bkx.a("renderedChunks", bkw.f, this.a, fxo::k));
      this.b.add(bkx.a("lastViewDistance", bkw.f, this.a, fxo::j));
      gaq $$0 = this.a.h();
      this.b.add(bkx.a("toUpload", bkw.g, $$0, gaq::c));
      this.b.add(bkx.a("freeBufferCount", bkw.g, $$0, gaq::d));
      this.b.add(bkx.a("toBatchCount", bkw.g, $$0, gaq::b));
      if (ets.a().isPresent()) {
         this.b.add(bkx.a("gpuUtilization", bkw.i, ezg.Q(), ezg::v));
      }
   }

   @Override
   public Set<bkx> a(Supplier<bjo> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
