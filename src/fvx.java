import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class fvx implements bki {
   private final fwo a;
   private final Set<bkg> b = new ObjectOpenHashSet();
   private final bko c = new bko();

   public fvx(LongSupplier $$0, fwo $$1) {
      this.a = $$1;
      this.b.add(bkp.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bkp.a());
      this.b.add(bkg.a("totalChunks", bkf.f, this.a, fwo::i));
      this.b.add(bkg.a("renderedChunks", bkf.f, this.a, fwo::k));
      this.b.add(bkg.a("lastViewDistance", bkf.f, this.a, fwo::j));
      fzq $$0 = this.a.h();
      this.b.add(bkg.a("toUpload", bkf.g, $$0, fzq::c));
      this.b.add(bkg.a("freeBufferCount", bkf.g, $$0, fzq::d));
      this.b.add(bkg.a("toBatchCount", bkf.g, $$0, fzq::b));
      if (esw.a().isPresent()) {
         this.b.add(bkg.a("gpuUtilization", bkf.i, eyk.P(), eyk::u));
      }
   }

   @Override
   public Set<bkg> a(Supplier<bja> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
