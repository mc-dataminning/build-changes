import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class geg implements boo {
   private final gex a;
   private final Set<bom> b = new ObjectOpenHashSet();
   private final bou c = new bou();

   public geg(LongSupplier $$0, gex $$1) {
      this.a = $$1;
      this.b.add(bov.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bov.a());
      this.b.add(bom.a("totalChunks", bol.f, this.a, gex::i));
      this.b.add(bom.a("renderedChunks", bol.f, this.a, gex::k));
      this.b.add(bom.a("lastViewDistance", bol.f, this.a, gex::j));
      gia $$0 = this.a.h();
      this.b.add(bom.a("toUpload", bol.g, $$0, gia::c));
      this.b.add(bom.a("freeBufferCount", bol.g, $$0, gia::d));
      this.b.add(bom.a("toBatchCount", bol.g, $$0, gia::b));
      if (fbb.a().isPresent()) {
         this.b.add(bom.a("gpuUtilization", bol.i, fgo.Q(), fgo::v));
      }
   }

   @Override
   public Set<bom> a(Supplier<bnd> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
