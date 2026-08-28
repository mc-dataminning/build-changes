import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class gcw implements bos {
   private final gdn a;
   private final Set<boq> b = new ObjectOpenHashSet();
   private final boy c = new boy();

   public gcw(LongSupplier $$0, gdn $$1) {
      this.a = $$1;
      this.b.add(boz.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(boz.a());
      this.b.add(boq.a("totalChunks", bop.f, this.a, gdn::i));
      this.b.add(boq.a("renderedChunks", bop.f, this.a, gdn::k));
      this.b.add(boq.a("lastViewDistance", bop.f, this.a, gdn::j));
      ggp $$0 = this.a.h();
      this.b.add(boq.a("toUpload", bop.g, $$0, ggp::c));
      this.b.add(boq.a("freeBufferCount", bop.g, $$0, ggp::d));
      this.b.add(boq.a("toBatchCount", bop.g, $$0, ggp::b));
      if (ezs.a().isPresent()) {
         this.b.add(boq.a("gpuUtilization", bop.i, ffg.Q(), ffg::v));
      }
   }

   @Override
   public Set<boq> a(Supplier<bnh> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
