import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class gnb implements brn {
   private final gnu a;
   private final Set<brl> b = new ObjectOpenHashSet();
   private final brt c = new brt();

   public gnb(LongSupplier $$0, gnu $$1) {
      this.a = $$1;
      this.b.add(bru.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bru.a());
      this.b.add(brl.a("totalChunks", brk.f, this.a, gnu::h));
      this.b.add(brl.a("renderedChunks", brk.f, this.a, gnu::j));
      this.b.add(brl.a("lastViewDistance", brk.f, this.a, gnu::i));
      grn $$0 = this.a.g();
      this.b.add(brl.a("toUpload", brk.g, $$0, grn::c));
      this.b.add(brl.a("freeBufferCount", brk.g, $$0, grn::d));
      this.b.add(brl.a("toBatchCount", brk.g, $$0, grn::b));
      if (fhh.a().isPresent()) {
         this.b.add(brl.a("gpuUtilization", brk.i, fnd.Q(), fnd::v));
      }
   }

   @Override
   public Set<brl> a(Supplier<bpy> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
