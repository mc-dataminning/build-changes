import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class gee implements boo {
   private final gev a;
   private final Set<bom> b = new ObjectOpenHashSet();
   private final bou c = new bou();

   public gee(LongSupplier $$0, gev $$1) {
      this.a = $$1;
      this.b.add(bov.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bov.a());
      this.b.add(bom.a("totalChunks", bol.f, this.a, gev::i));
      this.b.add(bom.a("renderedChunks", bol.f, this.a, gev::k));
      this.b.add(bom.a("lastViewDistance", bol.f, this.a, gev::j));
      ghy $$0 = this.a.h();
      this.b.add(bom.a("toUpload", bol.g, $$0, ghy::c));
      this.b.add(bom.a("freeBufferCount", bol.g, $$0, ghy::d));
      this.b.add(bom.a("toBatchCount", bol.g, $$0, ghy::b));
      if (faz.a().isPresent()) {
         this.b.add(bom.a("gpuUtilization", bol.i, fgm.Q(), fgm::v));
      }
   }

   @Override
   public Set<bom> a(Supplier<bnd> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
