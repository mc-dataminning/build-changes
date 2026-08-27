import java.util.Collection;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class qu {
   public static final String a = "defaultBatch";
   private final String b;
   private final Collection<rq> c;
   @Nullable
   private final Consumer<ama> d;
   @Nullable
   private final Consumer<ama> e;

   public qu(String $$0, Collection<rq> $$1, @Nullable Consumer<ama> $$2, @Nullable Consumer<ama> $$3) {
      if ($$1.isEmpty()) {
         throw new IllegalArgumentException("A GameTestBatch must include at least one TestFunction!");
      } else {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = $$3;
      }
   }

   public String a() {
      return this.b;
   }

   public Collection<rq> b() {
      return this.c;
   }

   public void a(ama $$0) {
      if (this.d != null) {
         this.d.accept($$0);
      }
   }

   public void b(ama $$0) {
      if (this.e != null) {
         this.e.accept($$0);
      }
   }
}
