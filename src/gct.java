import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class gct implements bop {
   private final gdk a;
   private final Set<bon> b = new ObjectOpenHashSet();
   private final bov c = new bov();

   public gct(LongSupplier $$0, gdk $$1) {
      this.a = $$1;
      this.b.add(bow.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bow.a());
      this.b.add(bon.a("totalChunks", bom.f, this.a, gdk::i));
      this.b.add(bon.a("renderedChunks", bom.f, this.a, gdk::k));
      this.b.add(bon.a("lastViewDistance", bom.f, this.a, gdk::j));
      ggm $$0 = this.a.h();
      this.b.add(bon.a("toUpload", bom.g, $$0, ggm::c));
      this.b.add(bon.a("freeBufferCount", bom.g, $$0, ggm::d));
      this.b.add(bon.a("toBatchCount", bom.g, $$0, ggm::b));
      if (ezp.a().isPresent()) {
         this.b.add(bon.a("gpuUtilization", bom.i, ffd.Q(), ffd::v));
      }
   }

   @Override
   public Set<bon> a(Supplier<bne> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
