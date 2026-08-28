import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class gpc implements bsa {
   private final gpv a;
   private final Set<bry> b = new ObjectOpenHashSet();
   private final bsg c = new bsg();

   public gpc(LongSupplier $$0, gpv $$1) {
      this.a = $$1;
      this.b.add(bsh.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bsh.a());
      this.b.add(bry.a("totalChunks", brx.f, this.a, gpv::h));
      this.b.add(bry.a("renderedChunks", brx.f, this.a, gpv::j));
      this.b.add(bry.a("lastViewDistance", brx.f, this.a, gpv::i));
      gtp $$0 = this.a.g();
      this.b.add(bry.a("toUpload", brx.g, $$0, gtp::c));
      this.b.add(bry.a("freeBufferCount", brx.g, $$0, gtp::d));
      this.b.add(bry.a("toBatchCount", brx.g, $$0, gtp::b));
      if (fjd.a().isPresent()) {
         this.b.add(bry.a("gpuUtilization", brx.i, foz.Q(), foz::v));
      }
   }

   @Override
   public Set<bry> a(Supplier<bql> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
