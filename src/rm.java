import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class rm implements ru {
   private static final Map<String, List<String>> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put("{}", Lists.newArrayList(new String[]{"DataVersion", "author", "size", "data", "entities", "palette", "palettes"}));
      $$0.put("{}.data.[].{}", Lists.newArrayList(new String[]{"pos", "state", "nbt"}));
      $$0.put("{}.entities.[].{}", Lists.newArrayList(new String[]{"blockPos", "pos"}));
   });
   private static final Set<String> b = Sets.newHashSet(new String[]{"{}.size.[]", "{}.data.[].{}", "{}.palette.[].{}", "{}.entities.[].{}"});
   private static final Pattern c = Pattern.compile("[A-Za-z0-9._+-]+");
   private static final String d = String.valueOf(':');
   private static final String e = String.valueOf(',');
   private static final String f = "[";
   private static final String g = "]";
   private static final String h = ";";
   private static final String i = " ";
   private static final String j = "{";
   private static final String k = "}";
   private static final String l = "\n";
   private final String m;
   private final int n;
   private final List<String> o;
   private String p = "";

   public rm() {
      this("    ", 0, Lists.newArrayList());
   }

   public rm(String $$0, int $$1, List<String> $$2) {
      this.m = $$0;
      this.n = $$1;
      this.o = $$2;
   }

   public String a(rq $$0) {
      $$0.a(this);
      return this.p;
   }

   @Override
   public void a(ro $$0) {
      this.p = ro.b($$0.r_());
   }

   @Override
   public void a(qu $$0) {
      this.p = $$0.l() + "b";
   }

   @Override
   public void a(rl $$0) {
      this.p = $$0.l() + "s";
   }

   @Override
   public void a(rb $$0) {
      this.p = String.valueOf($$0.l());
   }

   @Override
   public void a(re $$0) {
      this.p = $$0.l() + "L";
   }

   @Override
   public void a(qz $$0) {
      this.p = $$0.k() + "f";
   }

   @Override
   public void a(qx $$0) {
      this.p = $$0.j() + "d";
   }

   @Override
   public void a(qt $$0) {
      StringBuilder $$1 = new StringBuilder("[").append("B").append(";");
      byte[] $$2 = $$0.e();

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         $$1.append(" ").append($$2[$$3]).append("B");
         if ($$3 != $$2.length - 1) {
            $$1.append(e);
         }
      }

      $$1.append("]");
      this.p = $$1.toString();
   }

   @Override
   public void a(ra $$0) {
      StringBuilder $$1 = new StringBuilder("[").append("I").append(";");
      int[] $$2 = $$0.g();

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         $$1.append(" ").append($$2[$$3]);
         if ($$3 != $$2.length - 1) {
            $$1.append(e);
         }
      }

      $$1.append("]");
      this.p = $$1.toString();
   }

   @Override
   public void a(rd $$0) {
      String $$1 = "L";
      StringBuilder $$2 = new StringBuilder("[").append("L").append(";");
      long[] $$3 = $$0.g();

      for (int $$4 = 0; $$4 < $$3.length; $$4++) {
         $$2.append(" ").append($$3[$$4]).append("L");
         if ($$4 != $$3.length - 1) {
            $$2.append(e);
         }
      }

      $$2.append("]");
      this.p = $$2.toString();
   }

   @Override
   public void a(rc $$0) {
      if ($$0.isEmpty()) {
         this.p = "[]";
      } else {
         StringBuilder $$1 = new StringBuilder("[");
         this.b("[]");
         String $$2 = b.contains(this.a()) ? "" : this.m;
         if (!$$2.isEmpty()) {
            $$1.append("\n");
         }

         for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
            $$1.append(Strings.repeat($$2, this.n + 1));
            $$1.append(new rm($$2, this.n + 1, this.o).a($$0.k($$3)));
            if ($$3 != $$0.size() - 1) {
               $$1.append(e).append($$2.isEmpty() ? " " : "\n");
            }
         }

         if (!$$2.isEmpty()) {
            $$1.append("\n").append(Strings.repeat($$2, this.n));
         }

         $$1.append("]");
         this.p = $$1.toString();
         this.b();
      }
   }

   @Override
   public void a(qw $$0) {
      if ($$0.g()) {
         this.p = "{}";
      } else {
         StringBuilder $$1 = new StringBuilder("{");
         this.b("{}");
         String $$2 = b.contains(this.a()) ? "" : this.m;
         if (!$$2.isEmpty()) {
            $$1.append("\n");
         }

         Collection<String> $$3 = this.b($$0);
         Iterator<String> $$4 = $$3.iterator();

         while ($$4.hasNext()) {
            String $$5 = $$4.next();
            rq $$6 = $$0.c($$5);
            this.b($$5);
            $$1.append(Strings.repeat($$2, this.n + 1)).append(a($$5)).append(d).append(" ").append(new rm($$2, this.n + 1, this.o).a($$6));
            this.b();
            if ($$4.hasNext()) {
               $$1.append(e).append($$2.isEmpty() ? " " : "\n");
            }
         }

         if (!$$2.isEmpty()) {
            $$1.append("\n").append(Strings.repeat($$2, this.n));
         }

         $$1.append("}");
         this.p = $$1.toString();
         this.b();
      }
   }

   private void b() {
      this.o.remove(this.o.size() - 1);
   }

   private void b(String $$0) {
      this.o.add($$0);
   }

   protected List<String> b(qw $$0) {
      Set<String> $$1 = Sets.newHashSet($$0.e());
      List<String> $$2 = Lists.newArrayList();
      List<String> $$3 = a.get(this.a());
      if ($$3 != null) {
         for (String $$4 : $$3) {
            if ($$1.remove($$4)) {
               $$2.add($$4);
            }
         }

         if (!$$1.isEmpty()) {
            $$1.stream().sorted().forEach($$2::add);
         }
      } else {
         $$2.addAll($$1);
         Collections.sort($$2);
      }

      return $$2;
   }

   public String a() {
      return String.join(".", this.o);
   }

   protected static String a(String $$0) {
      return c.matcher($$0).matches() ? $$0 : ro.b($$0);
   }

   @Override
   public void a(qy $$0) {
   }
}
