import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.regex.Pattern;

public class uz implements ve {
   private static final Pattern a = Pattern.compile("[A-Za-z._]+[A-Za-z0-9._+-]*");
   private final StringBuilder b = new StringBuilder();

   public String a() {
      return this.b.toString();
   }

   @Override
   public void a(uy $$0) {
      this.b.append(uy.b($$0.k()));
   }

   @Override
   public void a(ty $$0) {
      this.b.append($$0.n()).append('b');
   }

   @Override
   public void a(ut $$0) {
      this.b.append($$0.n()).append('s');
   }

   @Override
   public void a(uf $$0) {
      this.b.append($$0.n());
   }

   @Override
   public void a(ui $$0) {
      this.b.append($$0.n()).append('L');
   }

   @Override
   public void a(ud $$0) {
      this.b.append($$0.n()).append('f');
   }

   @Override
   public void a(ub $$0) {
      this.b.append($$0.n()).append('d');
   }

   @Override
   public void a(tx $$0) {
      this.b.append("[B;");
      byte[] $$1 = $$0.e();

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$2 != 0) {
            this.b.append(',');
         }

         this.b.append($$1[$$2]).append('B');
      }

      this.b.append(']');
   }

   @Override
   public void a(ue $$0) {
      this.b.append("[I;");
      int[] $$1 = $$0.g();

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$2 != 0) {
            this.b.append(',');
         }

         this.b.append($$1[$$2]);
      }

      this.b.append(']');
   }

   @Override
   public void a(uh $$0) {
      this.b.append("[L;");
      long[] $$1 = $$0.g();

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$2 != 0) {
            this.b.append(',');
         }

         this.b.append($$1[$$2]).append('L');
      }

      this.b.append(']');
   }

   @Override
   public void a(ug $$0) {
      this.b.append('[');

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         if ($$1 != 0) {
            this.b.append(',');
         }

         $$0.c($$1).a(this);
      }

      this.b.append(']');
   }

   @Override
   public void a(ua $$0) {
      this.b.append('{');
      List<Entry<String, va>> $$1 = new ArrayList<>($$0.g());
      $$1.sort(Entry.comparingByKey());

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         Entry<String, va> $$3 = $$1.get($$2);
         if ($$2 != 0) {
            this.b.append(',');
         }

         this.a($$3.getKey());
         this.b.append(':');
         $$3.getValue().a(this);
      }

      this.b.append('}');
   }

   private void a(String $$0) {
      if (!$$0.equalsIgnoreCase("true") && !$$0.equalsIgnoreCase("false") && a.matcher($$0).matches()) {
         this.b.append($$0);
      } else {
         uy.a($$0, this.b);
      }
   }

   @Override
   public void a(uc $$0) {
      this.b.append("END");
   }
}
