import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class gdk implements bod {
   private final geb a;
   private final Set<bob> b = new ObjectOpenHashSet();
   private final boj c = new boj();

   public gdk(LongSupplier $$0, geb $$1) {
      this.a = $$1;
      this.b.add(bok.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bok.a());
      this.b.add(bob.a("totalChunks", boa.f, this.a, geb::i));
      this.b.add(bob.a("renderedChunks", boa.f, this.a, geb::k));
      this.b.add(bob.a("lastViewDistance", boa.f, this.a, geb::j));
      ghd $$0 = this.a.h();
      this.b.add(bob.a("toUpload", boa.g, $$0, ghd::c));
      this.b.add(bob.a("freeBufferCount", boa.g, $$0, ghd::d));
      this.b.add(bob.a("toBatchCount", boa.g, $$0, ghd::b));
      if (faf.a().isPresent()) {
         this.b.add(bob.a("gpuUtilization", boa.i, fft.Q(), fft::v));
      }
   }

   @Override
   public Set<bob> a(Supplier<bms> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
