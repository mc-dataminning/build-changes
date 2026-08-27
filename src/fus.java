import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class fus implements bjr {
   private final fvj a;
   private final Set<bjp> b = new ObjectOpenHashSet();
   private final bjx c = new bjx();

   public fus(LongSupplier $$0, fvj $$1) {
      this.a = $$1;
      this.b.add(bjy.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bjy.a());
      this.b.add(bjp.a("totalChunks", bjo.f, this.a, fvj::i));
      this.b.add(bjp.a("renderedChunks", bjo.f, this.a, fvj::k));
      this.b.add(bjp.a("lastViewDistance", bjo.f, this.a, fvj::j));
      fyk $$0 = this.a.h();
      this.b.add(bjp.a("toUpload", bjo.g, $$0, fyk::c));
      this.b.add(bjp.a("freeBufferCount", bjo.g, $$0, fyk::d));
      this.b.add(bjp.a("toBatchCount", bjo.g, $$0, fyk::b));
      if (ert.a().isPresent()) {
         this.b.add(bjp.a("gpuUtilization", bjo.i, exh.O(), exh::u));
      }
   }

   @Override
   public Set<bjp> a(Supplier<bij> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
