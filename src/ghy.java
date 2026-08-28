import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class ghy implements bqc {
   private final git a;
   private final Set<bqa> b = new ObjectOpenHashSet();
   private final bqi c = new bqi();

   public ghy(LongSupplier $$0, git $$1) {
      this.a = $$1;
      this.b.add(bqj.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bqj.a());
      this.b.add(bqa.a("totalChunks", bpz.f, this.a, git::h));
      this.b.add(bqa.a("renderedChunks", bpz.f, this.a, git::j));
      this.b.add(bqa.a("lastViewDistance", bpz.f, this.a, git::i));
      gmk $$0 = this.a.g();
      this.b.add(bqa.a("toUpload", bpz.g, $$0, gmk::c));
      this.b.add(bqa.a("freeBufferCount", bpz.g, $$0, gmk::d));
      this.b.add(bqa.a("toBatchCount", bpz.g, $$0, gmk::b));
      if (fed.a().isPresent()) {
         this.b.add(bqa.a("gpuUtilization", bpz.i, fjx.Q(), fjx::v));
      }
   }

   @Override
   public Set<bqa> a(Supplier<boo> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
