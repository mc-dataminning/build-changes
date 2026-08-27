import java.util.Collection;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class pt {
   public static final String a = "defaultBatch";
   private final String b;
   private final Collection<qp> c;
   @Nullable
   private final Consumer<akr> d;
   @Nullable
   private final Consumer<akr> e;

   public pt(String $$0, Collection<qp> $$1, @Nullable Consumer<akr> $$2, @Nullable Consumer<akr> $$3) {
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

   public Collection<qp> b() {
      return this.c;
   }

   public void a(akr $$0) {
      if (this.d != null) {
         this.d.accept($$0);
      }
   }

   public void b(akr $$0) {
      if (this.e != null) {
         this.e.accept($$0);
      }
   }
}
