import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.bytes.ByteCollection;
import it.unimi.dsi.fastutil.bytes.ByteOpenHashSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.slf4j.Logger;

public class uy implements ux {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 8;
   private static final int c = 64;
   private static final int d = 128;
   private static final ByteCollection e = new ByteOpenHashSet(Arrays.asList((byte)1, (byte)2, (byte)3, (byte)4, (byte)5, (byte)6));
   private static final n f = n.l;
   private static final n g = n.k;
   private static final n h = n.g;
   private static final n i = n.m;
   private static final Pattern j = Pattern.compile("[A-Za-z0-9._+-]+");
   private static final String k = "[";
   private static final String l = "]";
   private static final String m = ";";
   private static final String n = " ";
   private static final String o = "{";
   private static final String p = "}";
   private static final String q = "\n";
   private static final String r = ": ";
   private static final String s = String.valueOf(',');
   private static final String t = s + "\n";
   private static final String u = s + " ";
   private static final wv v = wv.b("<...>").a(n.h);
   private static final wv w = wv.b("b").a(i);
   private static final wv x = wv.b("s").a(i);
   private static final wv y = wv.b("I").a(i);
   private static final wv z = wv.b("L").a(i);
   private static final wv A = wv.b("f").a(i);
   private static final wv B = wv.b("d").a(i);
   private static final wv C = wv.b("B").a(i);
   private final String D;
   private int E;
   private int F;
   private final xj G = wv.i();

   public uy(String $$0) {
      this.D = $$0;
   }

   public wv a(ut $$0) {
      $$0.a(this);
      return this.G;
   }

   @Override
   public void a(ur $$0) {
      String $$1 = ur.b($$0.p_());
      String $$2 = $$1.substring(0, 1);
      wv $$3 = wv.b($$1.substring(1, $$1.length() - 1)).a(g);
      this.G.f($$2).b($$3).f($$2);
   }

   @Override
   public void a(tu $$0) {
      this.G.b(wv.b(String.valueOf($$0.l())).a(h)).b(w);
   }

   @Override
   public void a(uo $$0) {
      this.G.b(wv.b(String.valueOf($$0.l())).a(h)).b(x);
   }

   @Override
   public void a(ub $$0) {
      this.G.b(wv.b(String.valueOf($$0.l())).a(h));
   }

   @Override
   public void a(ue $$0) {
      this.G.b(wv.b(String.valueOf($$0.l())).a(h)).b(z);
   }

   @Override
   public void a(tz $$0) {
      this.G.b(wv.b(String.valueOf($$0.k())).a(h)).b(A);
   }

   @Override
   public void a(tx $$0) {
      this.G.b(wv.b(String.valueOf($$0.j())).a(h)).b(B);
   }

   @Override
   public void a(tt $$0) {
      this.G.f("[").b(C).f(";");
      byte[] $$1 = $$0.e();

      for (int $$2 = 0; $$2 < $$1.length && $$2 < 128; $$2++) {
         xj $$3 = wv.b(String.valueOf($$1[$$2])).a(h);
         this.G.f(" ").b($$3).b(C);
         if ($$2 != $$1.length - 1) {
            this.G.f(s);
         }
      }

      if ($$1.length > 128) {
         this.G.b(v);
      }

      this.G.f("]");
   }

   @Override
   public void a(ua $$0) {
      this.G.f("[").b(y).f(";");
      int[] $$1 = $$0.g();

      for (int $$2 = 0; $$2 < $$1.length && $$2 < 128; $$2++) {
         this.G.f(" ").b(wv.b(String.valueOf($$1[$$2])).a(h));
         if ($$2 != $$1.length - 1) {
            this.G.f(s);
         }
      }

      if ($$1.length > 128) {
         this.G.b(v);
      }

      this.G.f("]");
   }

   @Override
   public void a(ud $$0) {
      this.G.f("[").b(z).f(";");
      long[] $$1 = $$0.g();

      for (int $$2 = 0; $$2 < $$1.length && $$2 < 128; $$2++) {
         wv $$3 = wv.b(String.valueOf($$1[$$2])).a(h);
         this.G.f(" ").b($$3).b(z);
         if ($$2 != $$1.length - 1) {
            this.G.f(s);
         }
      }

      if ($$1.length > 128) {
         this.G.b(v);
      }

      this.G.f("]");
   }

   @Override
   public void a(uc $$0) {
      if ($$0.isEmpty()) {
         this.G.f("[]");
      } else if (this.F >= 64) {
         this.G.f("[").b(v).f("]");
      } else if (e.contains($$0.f()) && $$0.size() <= 8) {
         this.G.f("[");

         for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
            if ($$1 != 0) {
               this.G.f(u);
            }

            this.a($$0.k($$1), false);
         }

         this.G.f("]");
      } else {
         this.G.f("[");
         if (!this.D.isEmpty()) {
            this.G.f("\n");
         }

         String $$2 = Strings.repeat(this.D, this.E + 1);

         for (int $$3 = 0; $$3 < $$0.size() && $$3 < 128; $$3++) {
            this.G.f($$2);
            this.a($$0.k($$3), true);
            if ($$3 != $$0.size() - 1) {
               this.G.f(this.D.isEmpty() ? u : t);
            }
         }

         if ($$0.size() > 128) {
            this.G.f($$2).b(v);
         }

         if (!this.D.isEmpty()) {
            this.G.f("\n" + Strings.repeat(this.D, this.E));
         }

         this.G.f("]");
      }
   }

   @Override
   public void a(tw $$0) {
      if ($$0.g()) {
         this.G.f("{}");
      } else if (this.F >= 64) {
         this.G.f("{").b(v).f("}");
      } else {
         this.G.f("{");
         Collection<String> $$1 = $$0.e();
         if (a.isDebugEnabled()) {
            List<String> $$2 = Lists.newArrayList($$0.e());
            Collections.sort($$2);
            $$1 = $$2;
         }

         if (!this.D.isEmpty()) {
            this.G.f("\n");
         }

         String $$3 = Strings.repeat(this.D, this.E + 1);
         Iterator<String> $$4 = $$1.iterator();

         while ($$4.hasNext()) {
            String $$5 = $$4.next();
            this.G.f($$3).b(a($$5)).f(": ");
            this.a($$0.c($$5), true);
            if ($$4.hasNext()) {
               this.G.f(this.D.isEmpty() ? u : t);
            }
         }

         if (!this.D.isEmpty()) {
            this.G.f("\n" + Strings.repeat(this.D, this.E));
         }

         this.G.f("}");
      }
   }

   private void a(ut $$0, boolean $$1) {
      if ($$1) {
         this.E++;
      }

      this.F++;

      try {
         $$0.a(this);
      } finally {
         if ($$1) {
            this.E--;
         }

         this.F--;
      }
   }

   protected static wv a(String $$0) {
      if (j.matcher($$0).matches()) {
         return wv.b($$0).a(f);
      } else {
         String $$1 = ur.b($$0);
         String $$2 = $$1.substring(0, 1);
         wv $$3 = wv.b($$1.substring(1, $$1.length() - 1)).a(f);
         return wv.b($$2).b($$3).f($$2);
      }
   }

   @Override
   public void a(ty $$0) {
   }
}
