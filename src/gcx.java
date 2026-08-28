import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class gcx implements bot {
   private final gdo a;
   private final Set<bor> b = new ObjectOpenHashSet();
   private final boz c = new boz();

   public gcx(LongSupplier $$0, gdo $$1) {
      this.a = $$1;
      this.b.add(bpa.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bpa.a());
      this.b.add(bor.a("totalChunks", boq.f, this.a, gdo::i));
      this.b.add(bor.a("renderedChunks", boq.f, this.a, gdo::k));
      this.b.add(bor.a("lastViewDistance", boq.f, this.a, gdo::j));
      ggq $$0 = this.a.h();
      this.b.add(bor.a("toUpload", boq.g, $$0, ggq::c));
      this.b.add(bor.a("freeBufferCount", boq.g, $$0, ggq::d));
      this.b.add(bor.a("toBatchCount", boq.g, $$0, ggq::b));
      if (ezt.a().isPresent()) {
         this.b.add(bor.a("gpuUtilization", boq.i, ffh.Q(), ffh::v));
      }
   }

   @Override
   public Set<bor> a(Supplier<bni> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
