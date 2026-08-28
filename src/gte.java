import com.google.common.hash.HashCode;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;

public class gte {
   private final gtb a;
   final gtc b;
   private final gtd c;
   private final Runnable d;
   private gte.c e;
   final List<gte.e> f = new ArrayList<>();

   public gte(gtb $$0, gtc $$1, gtd $$2, Runnable $$3, gte.c $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   void f() {
      this.d.run();
   }

   private void b(UUID $$0) {
      for (gte.e $$1 : this.f) {
         if ($$1.a.equals($$0)) {
            $$1.a(gte.d.f);
         }
      }
   }

   public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
      if (this.e == gte.c.c) {
         this.b.a($$0, gtc.a.a);
      } else {
         this.a($$0, new gte.e($$0, $$1, $$2));
      }
   }

   public void a(UUID $$0, Path $$1) {
      if (this.e == gte.c.c) {
         this.b.a($$0, gtc.a.a);
      } else {
         URL $$2;
         try {
            $$2 = $$1.toUri().toURL();
         } catch (MalformedURLException var5) {
            throw new IllegalStateException("Can't convert path to URL " + $$1, var5);
         }

         gte.e $$5 = new gte.e($$0, $$2, null);
         $$5.f = gte.b.c;
         $$5.d = $$1;
         this.a($$0, $$5);
      }
   }

   private void a(UUID $$0, gte.e $$1) {
      this.b($$0);
      this.f.add($$1);
      if (this.e == gte.c.b) {
         this.a($$1);
      }

      this.f();
   }

   private void a(gte.e $$0) {
      this.b.a($$0.a, gtc.b.a);
      $$0.h = true;
   }

   @Nullable
   private gte.e c(UUID $$0) {
      for (gte.e $$1 : this.f) {
         if (!$$1.a() && $$1.a.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(UUID $$0) {
      gte.e $$1 = this.c($$0);
      if ($$1 != null) {
         $$1.a(gte.d.e);
         this.f();
      }
   }

   public void a() {
      for (gte.e $$0 : this.f) {
         $$0.a(gte.d.e);
      }

      this.f();
   }

   public void b() {
      this.e = gte.c.b;

      for (gte.e $$0 : this.f) {
         if (!$$0.h && !$$0.a()) {
            this.a($$0);
         }
      }

      this.f();
   }

   public void c() {
      this.e = gte.c.c;

      for (gte.e $$0 : this.f) {
         if (!$$0.h) {
            $$0.a(gte.d.c);
         }
      }

      this.f();
   }

   public void d() {
      this.e = gte.c.a;
   }

   public void e() {
      boolean $$0 = this.h();
      if (!$$0) {
         this.i();
      }

      this.g();
   }

   private void g() {
      this.f.removeIf($$0 -> {
         if ($$0.g != gte.a.a) {
            return false;
         } else if ($$0.e != null) {
            gtc.a $$1 = $$0.e.g;
            if ($$1 != null) {
               this.b.a($$0.a, $$1);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   private void a(Collection<gte.e> $$0, asl.b $$1) {
      if (!$$1.b().isEmpty()) {
         for (gte.e $$2 : this.f) {
            if ($$2.g != gte.a.c) {
               if ($$1.b().contains($$2.a)) {
                  $$2.a(gte.d.a);
               } else {
                  $$2.a(gte.d.d);
               }
            }
         }
      }

      for (gte.e $$3 : $$0) {
         Path $$4 = $$1.a().get($$3.a);
         if ($$4 != null) {
            $$3.f = gte.b.c;
            $$3.d = $$4;
            if (!$$3.a()) {
               this.b.a($$3.a, gtc.b.b);
            }
         }
      }

      this.f();
   }

   private boolean h() {
      List<gte.e> $$0 = new ArrayList<>();
      boolean $$1 = false;

      for (gte.e $$2 : this.f) {
         if (!$$2.a() && $$2.h) {
            if ($$2.f != gte.b.c) {
               $$1 = true;
            }

            if ($$2.f == gte.b.a) {
               $$2.f = gte.b.b;
               $$0.add($$2);
            }
         }
      }

      if (!$$0.isEmpty()) {
         Map<UUID, asl.c> $$3 = new HashMap<>();

         for (gte.e $$4 : $$0) {
            $$3.put($$4.a, new asl.c($$4.b, $$4.c));
         }

         this.a.a($$3, $$1x -> this.a($$0, $$1x));
      }

      return $$1;
   }

   private void i() {
      boolean $$0 = false;
      final List<gte.e> $$1 = new ArrayList<>();
      final List<gte.e> $$2 = new ArrayList<>();

      for (gte.e $$3 : this.f) {
         if ($$3.g == gte.a.b) {
            return;
         }

         boolean $$4 = $$3.h && $$3.f == gte.b.c && !$$3.a();
         if ($$4 && $$3.g == gte.a.a) {
            $$1.add($$3);
            $$0 = true;
         }

         if ($$3.g == gte.a.c) {
            if (!$$4) {
               $$0 = true;
               $$2.add($$3);
            } else {
               $$1.add($$3);
            }
         }
      }

      if ($$0) {
         for (gte.e $$5 : $$1) {
            if ($$5.g != gte.a.c) {
               $$5.g = gte.a.b;
            }
         }

         for (gte.e $$6 : $$2) {
            $$6.g = gte.a.b;
         }

         this.c.scheduleReload(new gtd.a() {
            @Override
            public void a() {
               for (gte.e $$0 : $$1) {
                  $$0.g = gte.a.c;
                  if ($$0.e == null) {
                     gte.this.b.a($$0.a, gtc.a.b);
                  }
               }

               for (gte.e $$1 : $$2) {
                  $$1.g = gte.a.a;
               }

               gte.this.f();
            }

            @Override
            public void a(boolean $$0) {
               if (!$$0) {
                  $$1.clear();

                  for (gte.e $$1 : gte.this.f) {
                     switch ($$1.g) {
                        case a:
                           $$1.a(gte.d.d);
                           break;
                        case b:
                           $$1.g = gte.a.a;
                           $$1.a(gte.d.b);
                           break;
                        case c:
                           $$1.add($$1);
                     }
                  }

                  gte.this.f();
               } else {
                  for (gte.e $$2 : gte.this.f) {
                     if ($$2.g == gte.a.b) {
                        $$2.g = gte.a.a;
                     }
                  }
               }
            }

            @Override
            public List<gtd.b> b() {
               return $$1.stream().map($$0 -> new gtd.b($$0.a, $$0.d)).toList();
            }
         });
      }
   }

   static enum a {
      a,
      b,
      c;
   }

   static enum b {
      a,
      b,
      c;
   }

   public static enum c {
      a,
      b,
      c;
   }

   static enum d {
      a(gtc.a.d),
      b(gtc.a.e),
      c(gtc.a.a),
      d(gtc.a.c),
      e(null),
      f(null);

      @Nullable
      final gtc.a g;

      private d(@Nullable final gtc.a $$0) {
         this.g = $$0;
      }
   }

   static class e {
      final UUID a;
      final URL b;
      @Nullable
      final HashCode c;
      @Nullable
      Path d;
      @Nullable
      gte.d e;
      gte.b f = gte.b.a;
      gte.a g = gte.a.a;
      boolean h;

      e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(gte.d $$0) {
         if (this.e == null) {
            this.e = $$0;
         }
      }

      public boolean a() {
         return this.e != null;
      }
   }
}
