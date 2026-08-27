import java.util.Collection;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class qv {
   public static final String a = "defaultBatch";
   private final String b;
   private final Collection<rq> c;
   @Nullable
   private final Consumer<ame> d;
   @Nullable
   private final Consumer<ame> e;

   public qv(String $$0, Collection<rq> $$1, @Nullable Consumer<ame> $$2, @Nullable Consumer<ame> $$3) {
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

   public void a(ame $$0) {
      if (this.d != null) {
         this.d.accept($$0);
      }
   }

   public void b(ame $$0) {
      if (this.e != null) {
         this.e.accept($$0);
      }
   }
}
