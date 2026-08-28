import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class gpt implements bsc {
   private final gqm a;
   private final Set<bsa> b = new ObjectOpenHashSet();
   private final bsi c = new bsi();

   public gpt(LongSupplier $$0, gqm $$1) {
      this.a = $$1;
      this.b.add(bsj.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bsj.a());
      this.b.add(bsa.a("totalChunks", brz.f, this.a, gqm::g));
      this.b.add(bsa.a("renderedChunks", brz.f, this.a, gqm::i));
      this.b.add(bsa.a("lastViewDistance", brz.f, this.a, gqm::h));
      gug $$0 = this.a.f();
      this.b.add(bsa.a("toUpload", brz.g, $$0, gug::c));
      this.b.add(bsa.a("freeBufferCount", brz.g, $$0, gug::d));
      this.b.add(bsa.a("toBatchCount", brz.g, $$0, gug::b));
      if (fjs.a().isPresent()) {
         this.b.add(bsa.a("gpuUtilization", brz.i, fpt.Q(), fpt::v));
      }
   }

   @Override
   public Set<bsa> a(Supplier<bqn> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
