import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class ggh implements bpm {
   private final ghc a;
   private final Set<bpk> b = new ObjectOpenHashSet();
   private final bps c = new bps();

   public ggh(LongSupplier $$0, ghc $$1) {
      this.a = $$1;
      this.b.add(bpt.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bpt.a());
      this.b.add(bpk.a("totalChunks", bpj.f, this.a, ghc::h));
      this.b.add(bpk.a("renderedChunks", bpj.f, this.a, ghc::j));
      this.b.add(bpk.a("lastViewDistance", bpj.f, this.a, ghc::i));
      gkt $$0 = this.a.g();
      this.b.add(bpk.a("toUpload", bpj.g, $$0, gkt::c));
      this.b.add(bpk.a("freeBufferCount", bpj.g, $$0, gkt::d));
      this.b.add(bpk.a("toBatchCount", bpj.g, $$0, gkt::b));
      if (fcx.a().isPresent()) {
         this.b.add(bpk.a("gpuUtilization", bpj.i, fil.Q(), fil::v));
      }
   }

   @Override
   public Set<bpk> a(Supplier<bob> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
