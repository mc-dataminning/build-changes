import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class ggx implements bpt {
   private final ghs a;
   private final Set<bpr> b = new ObjectOpenHashSet();
   private final bpz c = new bpz();

   public ggx(LongSupplier $$0, ghs $$1) {
      this.a = $$1;
      this.b.add(bqa.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bqa.a());
      this.b.add(bpr.a("totalChunks", bpq.f, this.a, ghs::h));
      this.b.add(bpr.a("renderedChunks", bpq.f, this.a, ghs::j));
      this.b.add(bpr.a("lastViewDistance", bpq.f, this.a, ghs::i));
      glj $$0 = this.a.g();
      this.b.add(bpr.a("toUpload", bpq.g, $$0, glj::c));
      this.b.add(bpr.a("freeBufferCount", bpq.g, $$0, glj::d));
      this.b.add(bpr.a("toBatchCount", bpq.g, $$0, glj::b));
      if (fdm.a().isPresent()) {
         this.b.add(bpr.a("gpuUtilization", bpq.i, fja.Q(), fja::v));
      }
   }

   @Override
   public Set<bpr> a(Supplier<boi> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
