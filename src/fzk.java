import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class fzk implements zr {
   private static final xe i = xe.c("disconnect.lost");
   private static final Logger j = LogUtils.getLogger();
   protected final fgj a;
   protected final wc b;
   @Nullable
   protected final gab c;
   @Nullable
   protected String d;
   protected final gwd e;
   @Nullable
   protected final fon f;
   protected boolean g;
   private final List<fzk.a> k = new ArrayList<>();
   protected final Map<akt, byte[]> h;

   protected fzk(fgj $$0, wc $$1, fzr $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.f();
      this.d = $$2.e();
      this.e = $$2.b();
      this.f = $$2.g();
      this.h = $$2.h();
   }

   @Override
   public void a(zu $$0) {
      this.a(new aaf($$0.b()), () -> !RenderSystem.isFrozenAtPollEvents(), Duration.ofMinutes(1L));
   }

   @Override
   public void a(zv $$0) {
      zo.a($$0, this, this.a);
      this.b(new aag($$0.b()));
   }

   @Override
   public void a(zs $$0) {
      aam $$1 = $$0.b();
      if (!($$1 instanceof aan)) {
         zo.a($$0, this, this.a);
         if ($$1 instanceof aak $$2) {
            this.d = $$2.b();
            this.e.a($$2.b());
         } else {
            this.a($$1);
         }
      }
   }

   protected abstract void a(aam var1);

   @Override
   public void a(zx $$0) {
      zo.a($$0, this, this.a);
      UUID $$1 = $$0.b();
      URL $$2 = a($$0.e());
      if ($$2 == null) {
         this.b.a(new aah($$1, aah.a.f));
      } else {
         String $$3 = $$0.f();
         boolean $$4 = $$0.g();
         gab.a $$5 = this.c != null ? this.c.b() : gab.a.c;
         if ($$5 != gab.a.c && (!$$4 || $$5 != gab.a.b)) {
            this.a.ae().a($$1, $$2, $$3);
         } else {
            this.a.a(this.a($$1, $$2, $$3, $$4, $$0.h().orElse(null)));
         }
      }
   }

   @Override
   public void a(zw $$0) {
      zo.a($$0, this, this.a);
      $$0.b().ifPresentOrElse($$0x -> this.a.ae().a($$0x), () -> this.a.ae().e());
   }

   static xe a(xe $$0, @Nullable xe $$1) {
      return (xe)($$1 == null ? $$0 : xe.a("multiplayer.texturePrompt.serverPrompt", $$0, $$1));
   }

   @Nullable
   private static URL a(String $$0) {
      try {
         URL $$1 = new URL($$0);
         String $$2 = $$1.getProtocol();
         return !"http".equals($$2) && !"https".equals($$2) ? null : $$1;
      } catch (MalformedURLException var3) {
         return null;
      }
   }

   @Override
   public void a(abr $$0) {
      zo.a($$0, this, this.a);
      this.b.a(new abu($$0.b(), this.h.get($$0.b())));
   }

   @Override
   public void a(zy $$0) {
      zo.a($$0, this, this.a);
      this.h.put($$0.b(), $$0.e());
   }

   @Override
   public void a(zz $$0) {
      zo.a($$0, this, this.a);
      if (this.c == null) {
         throw new IllegalStateException("Cannot transfer to server from singleplayer");
      } else {
         this.g = true;
         this.b.a(xe.c("disconnect.transfer"));
         this.b.m();
         this.b.n();
         gbe $$1 = new gbe($$0.b(), $$0.e());
         fnf.a(Objects.requireNonNullElseGet(this.f, fou::new), this.a, $$1, this.c, false, new gaf(this.h));
      }
   }

   @Override
   public void a(zt $$0) {
      this.b.a($$0.b());
   }

   protected void f() {
      Iterator<fzk.a> $$0 = this.k.iterator();

      while ($$0.hasNext()) {
         fzk.a $$1 = $$0.next();
         if ($$1.b().getAsBoolean()) {
            this.b($$1.a);
            $$0.remove();
         } else if ($$1.c() <= ad.b()) {
            $$0.remove();
         }
      }
   }

   public void b(zl<?> $$0) {
      this.b.a($$0);
   }

   @Override
   public void a(xe $$0) {
      this.e.c();
      this.a.a(this.b($$0), this.g);
      j.warn("Client disconnected with reason: {}", $$0.getString());
   }

   @Override
   public void a(p $$0) {
      $$0.a("Server type", () -> this.c != null ? this.c.f().toString() : "<none>");
      $$0.a("Server brand", () -> this.d);
   }

   protected fon b(xe $$0) {
      fon $$1 = Objects.requireNonNullElseGet(this.f, () -> new frp(new fou()));
      return (fon)(this.c != null && this.c.e() ? new gwx($$1, i, $$0) : new fnn($$1, i, $$0));
   }

   @Nullable
   public String g() {
      return this.d;
   }

   private void a(zl<? extends wq> $$0, BooleanSupplier $$1, Duration $$2) {
      if ($$1.getAsBoolean()) {
         this.b($$0);
      } else {
         this.k.add(new fzk.a($$0, $$1, ad.b() + $$2.toMillis()));
      }
   }

   private fon a(UUID $$0, URL $$1, String $$2, boolean $$3, @Nullable xe $$4) {
      fon $$5 = this.a.y;
      return $$5 instanceof fzk.b $$6 ? $$6.a(this.a, $$0, $$1, $$2, $$3, $$4) : new fzk.b(this.a, $$5, List.of(new fzk.b.a($$0, $$1, $$2)), $$3, $$4);
   }

   static record a(zl<? extends wq> a, BooleanSupplier b, long c) {
   }

   class b extends fne {
      private final List<fzk.b.a> r;
      @Nullable
      private final fon s;

      b(fgj $$0, @Nullable fon $$1, List<fzk.b.a> $$2, boolean $$3, @Nullable xe $$4) {
         super(
            $$5 -> {
               $$0.a($$1);
               gto $$6 = $$0.ae();
               if ($$5) {
                  if (fzk.this.c != null) {
                     fzk.this.c.a(gab.a.a);
                  }

                  $$6.g();
               } else {
                  $$6.h();
                  if ($$3) {
                     fzk.this.b.a(xe.c("multiplayer.requiredTexturePrompt.disconnect"));
                  } else if (fzk.this.c != null) {
                     fzk.this.c.a(gab.a.b);
                  }
               }

               for (fzk.b.a $$7 : $$2) {
                  $$6.a($$7.a, $$7.b, $$7.c);
               }

               if (fzk.this.c != null) {
                  gac.b(fzk.this.c);
               }
            },
            $$3 ? xe.c("multiplayer.requiredTexturePrompt.line1") : xe.c("multiplayer.texturePrompt.line1"),
            fzk.a($$3 ? xe.c("multiplayer.requiredTexturePrompt.line2").a(n.o, n.r) : xe.c("multiplayer.texturePrompt.line2"), $$4),
            $$3 ? xd.i : xd.f,
            $$3 ? xd.p : xd.g
         );
         this.r = $$2;
         this.s = $$1;
      }

      public fzk.b a(fgj $$0, UUID $$1, URL $$2, String $$3, boolean $$4, @Nullable xe $$5) {
         List<fzk.b.a> $$6 = ImmutableList.builderWithExpectedSize(this.r.size() + 1).addAll(this.r).add(new fzk.b.a($$1, $$2, $$3)).build();
         return fzk.this.new b($$0, this.s, $$6, $$4, $$5);
      }

      static record a(UUID a, URL b, String c) {
      }
   }
}
