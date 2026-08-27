import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class fzp implements bmc {
   private final gag a;
   private final Set<bma> b = new ObjectOpenHashSet();
   private final bmi c = new bmi();

   public fzp(LongSupplier $$0, gag $$1) {
      this.a = $$1;
      this.b.add(bmj.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bmj.a());
      this.b.add(bma.a("totalChunks", blz.f, this.a, gag::i));
      this.b.add(bma.a("renderedChunks", blz.f, this.a, gag::k));
      this.b.add(bma.a("lastViewDistance", blz.f, this.a, gag::j));
      gdi $$0 = this.a.h();
      this.b.add(bma.a("toUpload", blz.g, $$0, gdi::c));
      this.b.add(bma.a("freeBufferCount", blz.g, $$0, gdi::d));
      this.b.add(bma.a("toBatchCount", blz.g, $$0, gdi::b));
      if (ewk.a().isPresent()) {
         this.b.add(bma.a("gpuUtilization", blz.i, fby.Q(), fby::v));
      }
   }

   @Override
   public Set<bma> a(Supplier<bkr> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
