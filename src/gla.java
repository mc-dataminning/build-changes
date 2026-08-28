import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class gla implements bqe {
   private final glt a;
   private final Set<bqc> b = new ObjectOpenHashSet();
   private final bqk c = new bqk();

   public gla(LongSupplier $$0, glt $$1) {
      this.a = $$1;
      this.b.add(bql.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(bql.a());
      this.b.add(bqc.a("totalChunks", bqb.f, this.a, glt::h));
      this.b.add(bqc.a("renderedChunks", bqb.f, this.a, glt::j));
      this.b.add(bqc.a("lastViewDistance", bqb.f, this.a, glt::i));
      gpl $$0 = this.a.g();
      this.b.add(bqc.a("toUpload", bqb.g, $$0, gpl::c));
      this.b.add(bqc.a("freeBufferCount", bqb.g, $$0, gpl::d));
      this.b.add(bqc.a("toBatchCount", bqb.g, $$0, gpl::b));
      if (ffm.a().isPresent()) {
         this.b.add(bqc.a("gpuUtilization", bqb.i, fli.Q(), fli::v));
      }
   }

   @Override
   public Set<bqc> a(Supplier<bop> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
