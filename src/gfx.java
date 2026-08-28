import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class gfx implements bph {
   private final ggr a;
   private final Set<bpf> b = new ObjectOpenHashSet();
   private final bpn c = new bpn();

   public gfx(LongSupplier $$0, ggr $$1) {
      this.a = $$1;
      this.b.add(bpo.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bpo.a());
      this.b.add(bpf.a("totalChunks", bpe.f, this.a, ggr::i));
      this.b.add(bpf.a("renderedChunks", bpe.f, this.a, ggr::k));
      this.b.add(bpf.a("lastViewDistance", bpe.f, this.a, ggr::j));
      gkd $$0 = this.a.h();
      this.b.add(bpf.a("toUpload", bpe.g, $$0, gkd::c));
      this.b.add(bpf.a("freeBufferCount", bpe.g, $$0, gkd::d));
      this.b.add(bpf.a("toBatchCount", bpe.g, $$0, gkd::b));
      if (fcn.a().isPresent()) {
         this.b.add(bpf.a("gpuUtilization", bpe.i, fib.Q(), fib::v));
      }
   }

   @Override
   public Set<bpf> a(Supplier<bnw> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
