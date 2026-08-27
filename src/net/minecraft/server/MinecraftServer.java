package net.minecraft.server;

import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.net.Proxy;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.KeyPair;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import javax.imageio.ImageIO;
import net.minecraft.obfuscate.DontObfuscate;
import org.slf4j.Logger;

public abstract class MinecraftServer extends bhr<ahc> implements agx, dt, AutoCloseable {
   private static final Logger l = LogUtils.getLogger();
   public static final String b = "vanilla";
   private static final float m = 0.8F;
   private static final int n = 100;
   private static final long o = 20L * aul.a / 20L;
   private static final int p = 20;
   private static final long q = 10L * aul.a;
   private static final int r = 100;
   private static final long s = 5L * aul.a;
   private static final long t = 10L * aul.b;
   private static final int u = 12;
   public static final int c = 11;
   private static final int v = 441;
   private static final int w = 6000;
   private static final int x = 100;
   private static final int y = 3;
   public static final int d = 29999984;
   public static final cse e = new cse("Demo World", crx.a, false, biu.c, false, new crw(), cst.c);
   public static final GameProfile f = new GameProfile(ac.d, "Anonymous Player");
   protected final een.c g;
   protected final eeq h;
   private final List<Runnable> z = Lists.newArrayList();
   private bgz A = bgy.a;
   private bfo B = this.A.f();
   private Consumer<bfn> C = $$0x -> this.aT();
   private Consumer<Path> D = $$0x -> {
   };
   private boolean E;
   @Nullable
   private MinecraftServer.c F;
   private boolean G;
   private final anc H;
   private final amo I;
   @Nullable
   private afj J;
   @Nullable
   private afj.a K;
   private final ats L = ats.a();
   private final DataFixer M;
   private String N;
   private int O = -1;
   private final ij<agr> P;
   private final Map<agh<csa>, ame> Q = Maps.newLinkedHashMap();
   private apu R;
   private volatile boolean S = true;
   private boolean T;
   private int U;
   private int V = 6000;
   protected final Proxy i;
   private boolean W;
   private boolean X;
   private boolean Y;
   private boolean Z;
   @Nullable
   private String aa;
   private int ab;
   private final long[] ac = new long[100];
   private long ad = 0L;
   @Nullable
   private KeyPair ae;
   @Nullable
   private GameProfile af;
   private boolean ag;
   private volatile boolean ah;
   private long ai;
   protected final ahb j;
   private long aj;
   private final Thread ak;
   private long al = ac.c();
   private long am;
   private boolean an;
   private final aos ao;
   private final agz ap = new agz(this);
   @Nullable
   private eef aq;
   private final ahi ar = new ahi();
   private final agw as;
   private boolean at;
   private float au;
   private final Executor av;
   @Nullable
   private String aw;
   private MinecraftServer.a ax;
   private final ebi ay;
   private final aha az;
   protected final eet k;
   private volatile boolean aA;

   public static <S extends MinecraftServer> S a(Function<Thread, S> $$0) {
      AtomicReference<S> $$1 = new AtomicReference<>();
      Thread $$2 = new Thread(() -> $$1.get().w(), "Server thread");
      $$2.setUncaughtExceptionHandler(($$0x, $$1x) -> l.error("Uncaught exception in server thread", $$1x));
      if (Runtime.getRuntime().availableProcessors() > 4) {
         $$2.setPriority(8);
      }

      S $$3 = (S)$$0.apply($$2);
      $$1.set($$3);
      $$2.start();
      return $$3;
   }

   public MinecraftServer(Thread $$0, een.c $$1, aos $$2, ahe $$3, Proxy $$4, DataFixer $$5, ahb $$6, amo $$7) {
      super("Server");
      this.P = $$3.c();
      this.k = $$3.d();
      if (!this.P.a().d(jz.aK).c(dks.b)) {
         throw new IllegalStateException("Missing Overworld dimension data");
      } else {
         this.i = $$4;
         this.ao = $$2;
         this.ax = new MinecraftServer.a($$3.a(), $$3.b());
         this.j = $$6;
         if ($$6.e() != null) {
            $$6.e().a(this);
         }

         this.H = new anc(this);
         this.az = new aha(this);
         this.I = $$7;
         this.g = $$1;
         this.h = $$1.e();
         this.M = $$5;
         this.as = new agw(this, this.ax.b.a());
         ic<cva> $$8 = this.P.a().d(jz.e).p().a(this.k.M());
         this.ay = new ebi($$3.a(), $$1, $$5, $$8);
         this.ak = $$0;
         this.av = ac.f();
      }
   }

   private void a(eei $$0) {
      $$0.a(this.aH().b(), "scoreboard");
   }

   protected abstract boolean e() throws IOException;

   protected void t_() {
      if (!bfu.e.c()) {
      }

      boolean $$0 = false;
      bfx $$1 = bfu.e.e();
      this.k.a(this.getServerModName(), this.M().a());
      amn $$2 = this.I.create(11);
      this.a($$2);
      this.r();
      this.b($$2);
      if ($$1 != null) {
         $$1.finish();
      }

      if ($$0) {
         try {
            bfu.e.b();
         } catch (Throwable var5) {
            l.warn("Failed to stop JFR profiling", var5);
         }
      }
   }

   protected void r() {
   }

   protected void a(amn $$0) {
      ees $$1 = this.k.K();
      boolean $$2 = this.k.C();
      io<dks> $$3 = this.P.a().d(jz.aK);
      dnp $$4 = this.k.A();
      long $$5 = $$4.b();
      long $$6 = cta.a($$5);
      List<crn> $$7 = ImmutableList.of(new dnd(), new dnc(), new cdd(), new bwd(), new cdo($$1));
      dks $$8 = $$3.a(dks.b);
      ame $$9 = new ame(this, this.av, this.g, $$1, csa.h, $$8, $$0, $$2, $$6, $$7, true, null);
      this.Q.put(csa.h, $$9);
      eei $$10 = $$9.t();
      this.a($$10);
      this.aq = new eef($$10);
      diz $$11 = $$9.C_();
      if (!$$1.p()) {
         try {
            a($$9, $$1, $$4.d(), $$2);
            $$1.c(true);
            if ($$2) {
               this.a(this.k);
            }
         } catch (Throwable var23) {
            o $$13 = o.a(var23, "Exception initializing level");

            try {
               $$9.a($$13);
            } catch (Throwable var22) {
            }

            throw new y($$13);
         }

         $$1.c(true);
      }

      this.ae().a($$9);
      if (this.k.G() != null) {
         this.aL().a(this.k.G());
      }

      bjd $$14 = $$9.I();

      for (Entry<agh<dks>, dks> $$15 : $$3.g()) {
         agh<dks> $$16 = $$15.getKey();
         if ($$16 != dks.b) {
            agh<csa> $$17 = agh.a(jz.aJ, $$16.a());
            eeh $$18 = new eeh(this.k, $$1);
            ame $$19 = new ame(this, this.av, this.g, $$18, $$17, $$15.getValue(), $$0, $$2, $$6, ImmutableList.of(), false, $$14);
            $$11.a(new dix.a($$19.C_()));
            this.Q.put($$17, $$19);
         }
      }

      $$11.a($$1.r());
   }

   private static void a(ame $$0, ees $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         $$1.a(ht.b.b(80), 0.0F);
      } else {
         amc $$4 = $$0.k();
         crh $$5 = new crh($$4.i().b().a());
         int $$6 = $$4.g().a($$0);
         if ($$6 < $$0.I_()) {
            ht $$7 = $$5.l();
            $$6 = $$0.a(dmr.a.b, $$7.u() + 8, $$7.w() + 8);
         }

         $$1.a($$5.l().b(8, $$6, 8), 0.0F);
         int $$8 = 0;
         int $$9 = 0;
         int $$10 = 0;
         int $$11 = -1;
         int $$12 = 5;

         for (int $$13 = 0; $$13 < atm.h(11); $$13++) {
            if ($$8 >= -5 && $$8 <= 5 && $$9 >= -5 && $$9 <= 5) {
               ht $$14 = alz.a($$0, new crh($$5.e + $$8, $$5.f + $$9));
               if ($$14 != null) {
                  $$1.a($$14, 0.0F);
                  break;
               }
            }

            if ($$8 == $$9 || $$8 < 0 && $$8 == -$$9 || $$8 > 0 && $$8 == 1 - $$9) {
               int $$15 = $$10;
               $$10 = -$$11;
               $$11 = $$15;
            }

            $$8 += $$10;
            $$9 += $$11;
         }

         if ($$2) {
            $$0.H_().c(jz.au).flatMap($$0x -> $$0x.b(pw.m)).ifPresent($$3x -> ((dpi)$$3x.a()).a($$0, $$4.g(), $$0.z, new ht($$1.a(), $$1.b(), $$1.c())));
         }
      }
   }

   private void a(eet $$0) {
      $$0.a(biu.a);
      $$0.d(true);
      ees $$1 = $$0.K();
      $$1.b(false);
      $$1.a(false);
      $$1.a(1000000000);
      $$1.b(6000L);
      $$1.a(crx.d);
   }

   private void b(amn $$0) {
      ame $$1 = this.F();
      l.info("Preparing start region for dimension {}", $$1.ad().a());
      ht $$2 = $$1.S();
      $$0.a(new crh($$2));
      amc $$3 = $$1.k();
      this.al = ac.c();
      $$3.a(amj.a, new crh($$2), 11, auo.a);

      while ($$3.b() != 441) {
         this.al = ac.c() + t;
         this.v_();
      }

      this.al = ac.c() + t;
      this.v_();

      for (ame $$4 : this.Q.values()) {
         crv $$5 = $$4.t().b(crv.a(), "chunks");
         if ($$5 != null) {
            LongIterator $$6 = $$5.b().iterator();

            while ($$6.hasNext()) {
               long $$7 = $$6.nextLong();
               crh $$8 = new crh($$7);
               $$4.k().a($$8, true);
            }
         }
      }

      this.al = ac.c() + t;
      this.v_();
      $$0.b();
      this.by();
   }

   public crx u_() {
      return this.k.m();
   }

   public boolean h() {
      return this.k.n();
   }

   public abstract int i();

   public abstract int j();

   public abstract boolean k();

   public boolean a(boolean $$0, boolean $$1, boolean $$2) {
      boolean $$3 = false;

      for (ame $$4 : this.H()) {
         if (!$$0) {
            l.info("Saving chunks for level '{}'/{}", $$4, $$4.ad().a());
         }

         $$4.a(null, $$1, $$4.e && !$$2);
         $$3 = true;
      }

      ame $$5 = this.F();
      ees $$6 = this.k.K();
      $$6.a($$5.C_().t());
      this.k.a(this.aL().c());
      this.g.a(this.aZ(), this.k, this.ae().r());
      if ($$1) {
         for (ame $$7 : this.H()) {
            l.info("ThreadedAnvilChunkStorage ({}): All chunks are saved", $$7.k().a.n());
         }

         l.info("ThreadedAnvilChunkStorage: All dimensions are saved");
      }

      return $$3;
   }

   public boolean b(boolean $$0, boolean $$1, boolean $$2) {
      boolean var4;
      try {
         this.aA = true;
         this.ae().h();
         var4 = this.a($$0, $$1, $$2);
      } finally {
         this.aA = false;
      }

      return var4;
   }

   @Override
   public void close() {
      this.t();
   }

   public void t() {
      if (this.A.e()) {
         this.aV();
      }

      l.info("Stopping server");
      this.af().b();
      this.aA = true;
      if (this.R != null) {
         l.info("Saving players");
         this.R.h();
         this.R.s();
      }

      l.info("Saving worlds");

      for (ame $$0 : this.H()) {
         if ($$0 != null) {
            $$0.e = false;
         }
      }

      while (this.Q.values().stream().anyMatch($$0x -> $$0x.k().a.f())) {
         this.al = ac.c() + aul.b;

         for (ame $$1 : this.H()) {
            $$1.k().o();
            $$1.k().a(() -> true, false);
         }

         this.v_();
      }

      this.a(false, true, false);

      for (ame $$2 : this.H()) {
         if ($$2 != null) {
            try {
               $$2.close();
            } catch (IOException var5) {
               l.error("Exception closing the level", var5);
            }
         }
      }

      this.aA = false;
      this.ax.close();

      try {
         this.g.close();
      } catch (IOException var4) {
         l.error("Failed to unlock level {}", this.g.d(), var4);
      }
   }

   public String u() {
      return this.N;
   }

   public void a_(String $$0) {
      this.N = $$0;
   }

   public boolean v() {
      return this.S;
   }

   public void a(boolean $$0) {
      this.S = false;
      if ($$0) {
         try {
            this.ak.join();
         } catch (InterruptedException var3) {
            l.error("Error while shutting down", var3);
         }
      }
   }

   protected void w() {
      try {
         if (!this.e()) {
            throw new IllegalStateException("Failed to initialize server");
         }

         this.al = ac.c();
         this.K = this.bm().orElse(null);
         this.J = this.bo();

         while (this.S) {
            long $$0;
            if (!this.A() && this.az.a() && this.az.d()) {
               $$0 = 0L;
               this.al = ac.c();
               this.ai = this.al;
            } else {
               $$0 = this.az.h();
               long $$2 = ac.c() - this.al;
               if ($$2 > o + 20L * $$0 && this.al - this.ai >= q + 100L * $$0) {
                  long $$3 = $$2 / $$0;
                  l.warn("Can't keep up! Is the server overloaded? Running {}ms or {} ticks behind", $$2 / aul.b, $$3);
                  this.al += $$3 * $$0;
                  this.ai = this.al;
               }
            }

            boolean $$4 = $$0 == 0L;
            if (this.G) {
               this.G = false;
               this.F = new MinecraftServer.c(ac.c(), this.U);
            }

            this.al += $$0;
            this.bz();
            this.B.a("tick");
            this.a($$4 ? () -> false : this::bk);
            this.B.b("nextTickWait");
            this.an = true;
            this.am = Math.max(ac.c() + $$0, this.al);
            this.v_();
            if ($$4) {
               this.az.e();
            }

            this.B.c();
            this.bA();
            this.ah = true;
            bfu.e.a(this.au);
         }
      } catch (Throwable var46) {
         l.error("Encountered an unexpected exception", var46);
         o $$7 = a(var46);
         this.b($$7.g());
         File $$8 = new File(new File(this.z(), "crash-reports"), "crash-" + ac.e() + "-server.txt");
         if ($$7.a($$8)) {
            l.error("This crash report has been saved to: {}", $$8.getAbsolutePath());
         } else {
            l.error("We were unable to save this crash report to disk.");
         }

         this.a($$7);
      } finally {
         try {
            this.T = true;
            this.t();
         } catch (Throwable var44) {
            l.error("Exception stopping the server", var44);
         } finally {
            if (this.j.e() != null) {
               this.j.e().a();
            }

            this.g();
         }
      }
   }

   private static o a(Throwable $$0) {
      y $$1 = null;

      for (Throwable $$2 = $$0; $$2 != null; $$2 = $$2.getCause()) {
         if ($$2 instanceof y $$3) {
            $$1 = $$3;
         }
      }

      o $$4;
      if ($$1 != null) {
         $$4 = $$1.a();
         if ($$1 != $$0) {
            $$4.a("Wrapped in").a("Wrapping exception", $$0);
         }
      } else {
         $$4 = new o("Exception in server tick loop", $$0);
      }

      return $$4;
   }

   private boolean bk() {
      return this.bw() || ac.c() < (this.an ? this.am : this.al);
   }

   protected void v_() {
      this.bu();
      this.c(() -> !this.bk());
   }

   protected ahc a(Runnable $$0) {
      return new ahc(this.U, $$0);
   }

   protected boolean a(ahc $$0) {
      return $$0.a() + 3 < this.U || this.bk();
   }

   @Override
   public boolean x() {
      boolean $$0 = this.bl();
      this.an = $$0;
      return $$0;
   }

   private boolean bl() {
      if (super.x()) {
         return true;
      } else {
         if (this.az.a() || this.bk()) {
            for (ame $$0 : this.H()) {
               if ($$0.k().d()) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   protected void b(ahc $$0) {
      this.aR().d("runTask");
      super.d($$0);
   }

   private Optional<afj.a> bm() {
      Optional<Path> $$0 = Optional.of(this.c("server-icon.png").toPath())
         .filter($$0x -> Files.isRegularFile($$0x))
         .or(() -> this.g.h().filter($$0x -> Files.isRegularFile($$0x)));
      return $$0.flatMap($$0x -> {
         try {
            BufferedImage $$1 = ImageIO.read($$0x.toFile());
            Preconditions.checkState($$1.getWidth() == 64, "Must be 64 pixels wide");
            Preconditions.checkState($$1.getHeight() == 64, "Must be 64 pixels high");
            ByteArrayOutputStream $$2 = new ByteArrayOutputStream();
            ImageIO.write($$1, "PNG", $$2);
            return Optional.of(new afj.a($$2.toByteArray()));
         } catch (Exception var3) {
            l.error("Couldn't load server icon", var3);
            return Optional.empty();
         }
      });
   }

   public Optional<Path> y() {
      return this.g.h();
   }

   public File z() {
      return new File(".");
   }

   public void a(o $$0) {
   }

   public void g() {
   }

   public boolean A() {
      return false;
   }

   public void a(BooleanSupplier $$0) {
      long $$1 = ac.c();
      this.U++;
      this.az.m();
      this.b($$0);
      if ($$1 - this.aj >= s) {
         this.aj = $$1;
         this.J = this.bo();
      }

      this.V--;
      if (this.V <= 0) {
         this.V = this.bn();
         l.debug("Autosave started");
         this.B.a("save");
         this.b(true, false, false);
         this.B.c();
         l.debug("Autosave finished");
      }

      this.B.a("tallying");
      long $$2 = ac.c() - $$1;
      int $$3 = this.U % 100;
      this.ad = this.ad - this.ac[$$3];
      this.ad += $$2;
      this.ac[$$3] = $$2;
      this.au = this.au * 0.8F + (float)$$2 / (float)aul.b * 0.19999999F;
      long $$4 = ac.c();
      this.a($$4 - $$1);
      this.B.c();
   }

   private int bn() {
      float $$1;
      if (this.az.a()) {
         long $$0 = this.aP() + 1L;
         $$1 = (float)aul.a / (float)$$0;
      } else {
         $$1 = this.az.f();
      }

      int $$3 = 300;
      return Math.max(100, (int)($$1 * 300.0F));
   }

   public void B() {
      int $$0 = this.bn();
      if ($$0 < this.V) {
         this.V = $$0;
      }
   }

   protected void a(long $$0) {
   }

   private afj bo() {
      afj.b $$0 = this.bx();
      return new afj(ur.a(this.aa), Optional.of($$0), Optional.of(afj.c.a()), Optional.ofNullable(this.K), this.ay());
   }

   private afj.b bx() {
      List<amf> $$0 = this.R.t();
      int $$1 = this.K();
      if (this.al()) {
         return new afj.b($$1, $$0.size(), List.of());
      } else {
         int $$2 = Math.min($$0.size(), 12);
         ObjectArrayList<GameProfile> $$3 = new ObjectArrayList($$2);
         int $$4 = atm.a(this.L, 0, $$0.size() - $$2);

         for (int $$5 = 0; $$5 < $$2; $$5++) {
            amf $$6 = $$0.get($$4 + $$5);
            $$3.add($$6.Z() ? $$6.fS() : f);
         }

         ac.c($$3, this.L);
         return new afj.b($$1, $$0.size(), $$3);
      }
   }

   public void b(BooleanSupplier $$0) {
      this.ae().t().forEach($$0x -> $$0x.c.g());
      this.B.a("commandFunctions");
      this.aC().b();
      this.B.b("levels");

      for (ame $$1 : this.H()) {
         this.B.a(() -> $$1 + " " + $$1.ad().a());
         if (this.U % 20 == 0) {
            this.B.a("timeSync");
            this.b($$1);
            this.B.c();
         }

         this.B.a("tick");

         try {
            $$1.a($$0);
         } catch (Throwable var6) {
            o $$3 = o.a(var6, "Exception ticking world");
            $$1.a($$3);
            throw new y($$3);
         }

         this.B.c();
         this.B.c();
      }

      this.B.b("connection");
      this.af().c();
      this.B.b("players");
      this.R.d();
      if (aa.aT) {
         rg.a.b();
      }

      this.B.b("server gui refresh");

      for (int $$4 = 0; $$4 < this.z.size(); $$4++) {
         this.z.get($$4).run();
      }

      this.B.b("send chunks");

      for (amf $$5 : this.R.t()) {
         $$5.c.f.a($$5);
         $$5.c.h();
      }

      this.B.c();
   }

   private void b(ame $$0) {
      this.R.a(new abq($$0.W(), $$0.X(), $$0.Y().b(crw.l)), $$0.ad());
   }

   public void C() {
      this.B.a("timeSync");

      for (ame $$0 : this.H()) {
         this.b($$0);
      }

      this.B.c();
   }

   public boolean D() {
      return true;
   }

   public void b(Runnable $$0) {
      this.z.add($$0);
   }

   protected void b(String $$0) {
      this.aw = $$0;
   }

   public boolean E() {
      return !this.ak.isAlive();
   }

   public File c(String $$0) {
      return new File(this.z(), $$0);
   }

   public final ame F() {
      return this.Q.get(csa.h);
   }

   @Nullable
   public ame a(agh<csa> $$0) {
      return this.Q.get($$0);
   }

   public Set<agh<csa>> G() {
      return this.Q.keySet();
   }

   public Iterable<ame> H() {
      return this.Q.values();
   }

   @Override
   public String I() {
      return aa.b().c();
   }

   @Override
   public int J() {
      return this.R.m();
   }

   @Override
   public int K() {
      return this.R.n();
   }

   public String[] L() {
      return this.R.e();
   }

   @DontObfuscate
   public String getServerModName() {
      return "vanilla";
   }

   public ab b(ab $$0) {
      $$0.a("Server Running", () -> Boolean.toString(this.S));
      if (this.R != null) {
         $$0.a("Player Count", () -> this.R.m() + " / " + this.R.n() + "; " + this.R.t());
      }

      $$0.a("Data Packs", () -> this.ao.f().stream().map($$0x -> $$0x.f() + ($$0x.c().a() ? "" : " (incompatible)")).collect(Collectors.joining(", ")));
      $$0.a("Enabled Feature Flags", () -> cgf.e.b(this.k.M()).stream().map(agi::toString).collect(Collectors.joining(", ")));
      $$0.a("World Generation", () -> this.k.D().toString());
      if (this.aw != null) {
         $$0.a("Server Id", () -> this.aw);
      }

      return this.a($$0);
   }

   public abstract ab a(ab var1);

   public atl M() {
      return atl.a("vanilla", this::getServerModName, "Server", MinecraftServer.class);
   }

   @Override
   public void a(ur $$0) {
      l.info($$0.getString());
   }

   public KeyPair N() {
      return this.ae;
   }

   public int O() {
      return this.O;
   }

   public void a(int $$0) {
      this.O = $$0;
   }

   @Nullable
   public GameProfile P() {
      return this.af;
   }

   public void b(@Nullable GameProfile $$0) {
      this.af = $$0;
   }

   public boolean Q() {
      return this.af != null;
   }

   protected void R() {
      l.info("Generating keypair");

      try {
         this.ae = asl.b();
      } catch (asm var2) {
         throw new IllegalStateException("Failed to generate key pair", var2);
      }
   }

   public void a(biu $$0, boolean $$1) {
      if ($$1 || !this.k.t()) {
         this.k.a(this.k.n() ? biu.d : $$0);
         this.by();
         this.ae().t().forEach(this::c);
      }
   }

   public int b(int $$0) {
      return $$0;
   }

   private void by() {
      for (ame $$0 : this.H()) {
         $$0.b(this.S(), this.Y());
      }
   }

   public void b(boolean $$0) {
      this.k.d($$0);
      this.ae().t().forEach(this::c);
   }

   private void c(amf $$0) {
      eej $$1 = $$0.dN().A_();
      $$0.c.b(new yp($$1.s(), $$1.t()));
   }

   public boolean S() {
      return this.k.s() != biu.a;
   }

   public boolean T() {
      return this.ag;
   }

   public void c(boolean $$0) {
      this.ag = $$0;
   }

   public Optional<MinecraftServer.b> U() {
      return Optional.empty();
   }

   public boolean V() {
      return this.U().filter(MinecraftServer.b::c).isPresent();
   }

   public abstract boolean l();

   public abstract int m();

   public boolean W() {
      return this.W;
   }

   public void d(boolean $$0) {
      this.W = $$0;
   }

   public boolean X() {
      return this.X;
   }

   public void e(boolean $$0) {
      this.X = $$0;
   }

   public boolean Y() {
      return true;
   }

   public boolean Z() {
      return true;
   }

   public abstract boolean n();

   public boolean aa() {
      return this.Y;
   }

   public void f(boolean $$0) {
      this.Y = $$0;
   }

   public boolean ab() {
      return this.Z;
   }

   public void g(boolean $$0) {
      this.Z = $$0;
   }

   public abstract boolean o();

   @Override
   public String ac() {
      return this.aa;
   }

   public void d(String $$0) {
      this.aa = $$0;
   }

   public boolean ad() {
      return this.T;
   }

   public apu ae() {
      return this.R;
   }

   public void a(apu $$0) {
      this.R = $$0;
   }

   public abstract boolean p();

   public void a(crx $$0) {
      this.k.a($$0);
   }

   public anc af() {
      return this.H;
   }

   public boolean ag() {
      return this.ah;
   }

   public boolean ah() {
      return false;
   }

   public boolean a(@Nullable crx $$0, boolean $$1, int $$2) {
      return false;
   }

   public int ai() {
      return this.U;
   }

   public int aj() {
      return 16;
   }

   public boolean a(ame $$0, ht $$1, cdu $$2) {
      return false;
   }

   public boolean ak() {
      return true;
   }

   public boolean al() {
      return false;
   }

   public Proxy am() {
      return this.i;
   }

   public int an() {
      return this.ab;
   }

   public void c(int $$0) {
      this.ab = $$0;
   }

   public MinecraftSessionService ao() {
      return this.j.b();
   }

   @Nullable
   public aty ap() {
      return this.j.a();
   }

   public GameProfileRepository aq() {
      return this.j.d();
   }

   @Nullable
   public apq ar() {
      return this.j.e();
   }

   @Nullable
   public afj as() {
      return this.J;
   }

   public void at() {
      this.aj = 0L;
   }

   public int au() {
      return 29999984;
   }

   @Override
   public boolean av() {
      return super.av() && !this.ad();
   }

   @Override
   public void c(Runnable $$0) {
      if (this.ad()) {
         throw new RejectedExecutionException("Server already shutting down");
      } else {
         super.c($$0);
      }
   }

   @Override
   public Thread aw() {
      return this.ak;
   }

   public int ax() {
      return 256;
   }

   public boolean ay() {
      return false;
   }

   public long az() {
      return this.al;
   }

   public DataFixer aA() {
      return this.M;
   }

   public int a(@Nullable ame $$0) {
      return $$0 != null ? $$0.Y().c(crw.s) : 10;
   }

   public agu aB() {
      return this.ax.b.e();
   }

   public agw aC() {
      return this.as;
   }

   public CompletableFuture<Void> a(Collection<String> $$0) {
      ip.b $$1 = this.P.b(agr.d);
      CompletableFuture<Void> $$2 = CompletableFuture.<ImmutableList>supplyAsync(
            () -> $$0.stream().map(this.ao::c).filter(Objects::nonNull).map(aop::e).collect(ImmutableList.toImmutableList()), this
         )
         .thenCompose($$1x -> {
            aox $$2x = new apa(anw.b, $$1x);
            return ags.a($$2x, $$1, this.k.M(), this.l() ? dv.a.b : dv.a.c, this.j(), this.av, this).whenComplete(($$1xx, $$2xx) -> {
               if ($$2xx != null) {
                  $$2x.close();
               }
            }).thenApply($$1xx -> new MinecraftServer.a($$2x, $$1xx));
         })
         .thenAcceptAsync($$1x -> {
            this.ax.close();
            this.ax = $$1x;
            this.ao.a($$0);
            cst $$2x = new cst(a(this.ao), this.k.M());
            this.k.a($$2x);
            this.ax.b.a(this.aZ());
            this.ae().h();
            this.ae().u();
            this.as.a(this.ax.b.a());
            this.ay.a(this.ax.a);
         }, this);
      if (this.bq()) {
         this.c($$2::isDone);
      }

      return $$2;
   }

   public static cst a(aos $$0, cro $$1, boolean $$2, cgd $$3) {
      $$0.a();
      if ($$2) {
         $$0.a(Collections.singleton("vanilla"));
         return cst.c;
      } else {
         Set<String> $$4 = Sets.newLinkedHashSet();

         for (String $$5 : $$1.a()) {
            if ($$0.d($$5)) {
               $$4.add($$5);
            } else {
               l.warn("Missing data pack {}", $$5);
            }
         }

         for (aop $$6 : $$0.c()) {
            String $$7 = $$6.f();
            if (!$$1.b().contains($$7)) {
               cgd $$8 = $$6.d();
               boolean $$9 = $$4.contains($$7);
               if (!$$9 && $$6.j().a()) {
                  if ($$8.a($$3)) {
                     l.info("Found new data pack {}, loading it automatically", $$7);
                     $$4.add($$7);
                  } else {
                     l.info("Found new data pack {}, but can't load it due to missing features {}", $$7, cgf.a($$3, $$8));
                  }
               }

               if ($$9 && !$$8.a($$3)) {
                  l.warn("Pack {} requires features {} that are not enabled for this world, disabling pack.", $$7, cgf.a($$3, $$8));
                  $$4.remove($$7);
               }
            }
         }

         if ($$4.isEmpty()) {
            l.info("No datapacks selected, forcing vanilla");
            $$4.add("vanilla");
         }

         $$0.a($$4);
         cro $$10 = a($$0);
         cgd $$11 = $$0.e();
         return new cst($$10, $$11);
      }
   }

   private static cro a(aos $$0) {
      Collection<String> $$1 = $$0.d();
      List<String> $$2 = ImmutableList.copyOf($$1);
      List<String> $$3 = $$0.b().stream().filter($$1x -> !$$1.contains($$1x)).collect(ImmutableList.toImmutableList());
      return new cro($$2, $$3);
   }

   public void a(du $$0) {
      if (this.aM()) {
         apu $$1 = $$0.m().ae();
         aqc $$2 = $$1.i();

         for (amf $$4 : Lists.newArrayList($$1.t())) {
            if (!$$2.a($$4.fS())) {
               $$4.c.b(ur.c("multiplayer.disconnect.not_whitelisted"));
            }
         }
      }
   }

   public aos aD() {
      return this.ao;
   }

   public dv aE() {
      return this.ax.b.d();
   }

   public du aF() {
      ame $$0 = this.F();
      return new du(this, $$0 == null ? eju.b : eju.a($$0.S()), ejt.a, $$0, 4, "Server", ur.b("Server"), this, null);
   }

   @Override
   public boolean k_() {
      return true;
   }

   @Override
   public boolean w_() {
      return true;
   }

   @Override
   public abstract boolean V_();

   public cor aG() {
      return this.ax.b.c();
   }

   public agz aH() {
      return this.ap;
   }

   public eef aI() {
      if (this.aq == null) {
         throw new NullPointerException("Called before server init");
      } else {
         return this.aq;
      }
   }

   public efa aJ() {
      return this.ax.b.b();
   }

   public crw aK() {
      return this.F().Y();
   }

   public ahi aL() {
      return this.ar;
   }

   public boolean aM() {
      return this.at;
   }

   public void h(boolean $$0) {
      this.at = $$0;
   }

   public float aN() {
      return this.au;
   }

   public aha aO() {
      return this.az;
   }

   public long aP() {
      return this.ad / (long)Math.min(100, Math.max(this.U, 1));
   }

   public long[] aQ() {
      return this.ac;
   }

   public int c(GameProfile $$0) {
      if (this.ae().f($$0)) {
         apw $$1 = this.ae().k().b($$0);
         if ($$1 != null) {
            return $$1.a();
         } else if (this.a($$0)) {
            return 4;
         } else if (this.Q()) {
            return this.ae().v() ? 4 : 0;
         } else {
            return this.i();
         }
      } else {
         return 0;
      }
   }

   public bfo aR() {
      return this.B;
   }

   public abstract boolean a(GameProfile var1);

   public void a(Path $$0) throws IOException {
   }

   private void b(Path $$0) {
      Path $$1 = $$0.resolve("levels");

      try {
         for (Entry<agh<csa>, ame> $$2 : this.Q.entrySet()) {
            agi $$3 = $$2.getKey().a();
            Path $$4 = $$1.resolve($$3.b()).resolve($$3.a());
            Files.createDirectories($$4);
            $$2.getValue().a($$4);
         }

         this.d($$0.resolve("gamerules.txt"));
         this.e($$0.resolve("classpath.txt"));
         this.c($$0.resolve("stats.txt"));
         this.f($$0.resolve("threads.txt"));
         this.a($$0.resolve("server.properties.txt"));
         this.g($$0.resolve("modules.txt"));
      } catch (IOException var7) {
         l.warn("Failed to save debug report", var7);
      }
   }

   private void c(Path $$0) throws IOException {
      try (Writer $$1 = Files.newBufferedWriter($$0)) {
         $$1.write(String.format(Locale.ROOT, "pending_tasks: %d\n", this.br()));
         $$1.write(String.format(Locale.ROOT, "average_tick_time: %f\n", this.aN()));
         $$1.write(String.format(Locale.ROOT, "tick_times: %s\n", Arrays.toString(this.ac)));
         $$1.write(String.format(Locale.ROOT, "queue: %s\n", ac.f()));
      }
   }

   private void d(Path $$0) throws IOException {
      try (Writer $$1 = Files.newBufferedWriter($$0)) {
         final List<String> $$2 = Lists.newArrayList();
         final crw $$3 = this.aK();
         crw.a(new crw.c() {
            @Override
            public <T extends crw.g<T>> void a(crw.e<T> $$0, crw.f<T> $$1) {
               $$2.add(String.format(Locale.ROOT, "%s=%s\n", $$0.a(), $$3.a($$0)));
            }
         });

         for (String $$4 : $$2) {
            $$1.write($$4);
         }
      }
   }

   private void e(Path $$0) throws IOException {
      try (Writer $$1 = Files.newBufferedWriter($$0)) {
         String $$2 = System.getProperty("java.class.path");
         String $$3 = System.getProperty("path.separator");

         for (String $$4 : Splitter.on($$3).split($$2)) {
            $$1.write($$4);
            $$1.write("\n");
         }
      }
   }

   private void f(Path $$0) throws IOException {
      ThreadMXBean $$1 = ManagementFactory.getThreadMXBean();
      ThreadInfo[] $$2 = $$1.dumpAllThreads(true, true);
      Arrays.sort($$2, Comparator.comparing(ThreadInfo::getThreadName));

      try (Writer $$3 = Files.newBufferedWriter($$0)) {
         for (ThreadInfo $$4 : $$2) {
            $$3.write($$4.toString());
            $$3.write(10);
         }
      }
   }

   private void g(Path $$0) throws IOException {
      try (Writer $$1 = Files.newBufferedWriter($$0)) {
         List<atn.a> $$2;
         try {
            $$2 = Lists.newArrayList(atn.a());
         } catch (Throwable var7) {
            l.warn("Failed to list native modules", var7);
            return;
         }

         $$2.sort(Comparator.comparing($$0x -> $$0x.a));

         for (atn.a $$5 : $$2) {
            $$1.write($$5.toString());
            $$1.write(10);
         }
      }
   }

   private void bz() {
      if (this.E) {
         this.A = bgx.a(new bhb(ac.b, this.l()), ac.b, ac.g(), new bhd("server"), this.C, $$0 -> {
            this.h(() -> this.b($$0.resolve("server")));
            this.D.accept($$0);
         });
         this.E = false;
      }

      this.B = bfr.a(this.A.f(), bfr.a("Server"));
      this.A.c();
      this.B.a();
   }

   private void bA() {
      this.B.b();
      this.A.d();
   }

   public boolean aS() {
      return this.A.e();
   }

   public void a(Consumer<bfn> $$0, Consumer<Path> $$1) {
      this.C = $$1x -> {
         this.aT();
         $$0.accept($$1x);
      };
      this.D = $$1;
      this.E = true;
   }

   public void aT() {
      this.A = bgy.a;
   }

   public void aU() {
      this.A.a();
   }

   public void aV() {
      this.A.b();
      this.B = this.A.f();
   }

   public Path a(eel $$0) {
      return this.g.a($$0);
   }

   public boolean aW() {
      return true;
   }

   public ebi aX() {
      return this.ay;
   }

   public eet aY() {
      return this.k;
   }

   public ip.b aZ() {
      return this.P.a();
   }

   public ij<agr> ba() {
      return this.P;
   }

   public ani a(amf $$0) {
      return ani.a;
   }

   public amg b(amf $$0) {
      return (amg)(this.T() ? new alv($$0) : new amg($$0));
   }

   @Nullable
   public crx bb() {
      return null;
   }

   public aph bc() {
      return this.ax.a;
   }

   public boolean bd() {
      return this.aA;
   }

   public boolean be() {
      return this.G || this.F != null;
   }

   public void bf() {
      this.G = true;
   }

   public bfn bg() {
      if (this.F == null) {
         return bfj.a;
      } else {
         bfn $$0 = this.F.a(ac.c(), this.U);
         this.F = null;
         return $$0;
      }
   }

   public int bh() {
      return 1000000;
   }

   public void a(ur $$0, un.a $$1, @Nullable String $$2) {
      String $$3 = $$1.a($$0).getString();
      if ($$2 != null) {
         l.info("[{}] {}", $$2, $$3);
      } else {
         l.info("{}", $$3);
      }
   }

   public um bi() {
      return um.a;
   }

   public boolean bj() {
      return true;
   }

   static record a(aox a, ags b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.close();
      }
   }

   public static record b(String a, String b, boolean c, @Nullable ur d) {
   }

   static class c {
      final long a;
      final int b;

      c(long $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      bfn a(final long $$0, final int $$1) {
         return new bfn() {
            @Override
            public List<bfq> a(String $$0x) {
               return Collections.emptyList();
            }

            @Override
            public boolean a(Path $$0x) {
               return false;
            }

            @Override
            public long a() {
               return c.this.a;
            }

            @Override
            public int b() {
               return c.this.b;
            }

            @Override
            public long c() {
               return $$0;
            }

            @Override
            public int d() {
               return $$1;
            }

            @Override
            public String e() {
               return "";
            }
         };
      }
   }
}
