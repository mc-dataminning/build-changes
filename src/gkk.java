import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class gkk implements brd {
   private final glf a;
   private final Set<brb> b = new ObjectOpenHashSet();
   private final brj c = new brj();

   public gkk(LongSupplier $$0, glf $$1) {
      this.a = $$1;
      this.b.add(brk.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(brk.a());
      this.b.add(brb.a("totalChunks", bra.f, this.a, glf::h));
      this.b.add(brb.a("renderedChunks", bra.f, this.a, glf::j));
      this.b.add(brb.a("lastViewDistance", bra.f, this.a, glf::i));
      gow $$0 = this.a.g();
      this.b.add(brb.a("toUpload", bra.g, $$0, gow::c));
      this.b.add(brb.a("freeBufferCount", bra.g, $$0, gow::d));
      this.b.add(brb.a("toBatchCount", bra.g, $$0, gow::b));
      if (fgj.a().isPresent()) {
         this.b.add(brb.a("gpuUtilization", bra.i, fme.Q(), fme::v));
      }
   }

   @Override
   public Set<brb> a(Supplier<bpp> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
