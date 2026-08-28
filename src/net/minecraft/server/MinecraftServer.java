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
import com.mojang.jtracy.DiscontinuousFrame;
import com.mojang.jtracy.TracyClient;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Writer;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.net.Proxy;
import java.nio.file.FileStore;
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
import java.util.UUID;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import javax.imageio.ImageIO;
import net.minecraft.obfuscate.DontObfuscate;
import org.slf4j.Logger;

public abstract class MinecraftServer extends btm<amh> implements ama, eel, ej {
   private static final Logger l = LogUtils.getLogger();
   public static final String b = "vanilla";
   private static final float m = 0.8F;
   private static final int n = 100;
   private static final long o = 20L * bau.a / 20L;
   private static final int p = 20;
   private static final long q = 10L * bau.a;
   private static final int r = 100;
   private static final long s = 5L * bau.a;
   private static final long t = 10L * bau.b;
   private static final int u = 12;
   private static final int v = 5;
   private static final int w = 6000;
   private static final int x = 100;
   private static final int y = 3;
   public static final int c = 29999984;
   public static final dkd d = new dkd("Demo World", djw.a, false, buq.c, false, new djv(cvl.h), dkx.d);
   public static final GameProfile e = new GameProfile(ag.e, "Anonymous Player");
   protected final ezx.c f;
   protected final faa g;
   private final List<Runnable> z = Lists.newArrayList();
   private bsu A = bst.a;
   private Consumer<brb> B = $$0x -> this.aU();
   private Consumer<Path> C = $$0x -> {
   };
   private boolean D;
   @Nullable
   private MinecraftServer.c E;
   private boolean F;
   private final asw G;
   private final asf H;
   @Nullable
   private akh I;
   @Nullable
   private akh.a J;
   private final azz K = azz.a();
   private final DataFixer L;
   private String M;
   private int N = -1;
   private final jn<alt> O;
   private final Map<alj<djz>, aru> P = Maps.newLinkedHashMap();
   private avu Q;
   private volatile boolean R = true;
   private boolean S;
   private int T;
   private int U = 6000;
   protected final Proxy h;
   private boolean V;
   private boolean W;
   private boolean X;
   private boolean Y;
   @Nullable
   private String Z;
   private int aa;
   private final long[] ab = new long[100];
   private long ac = 0L;
   @Nullable
   private KeyPair ad;
   @Nullable
   private GameProfile ae;
   private boolean af;
   private volatile boolean ag;
   private long ah;
   protected final amf i;
   private long ai;
   private final Thread aj;
   private long ak = ag.d();
   private long al = ag.d();
   private long am;
   private long an = ag.d();
   private boolean ao = false;
   private long ap;
   private boolean aq;
   private final aur ar;
   private final amd as = new amd(this);
   @Nullable
   private ezo at;
   private final amn au = new amn();
   private final alz av;
   private boolean aw;
   private float ax;
   private final Executor ay;
   @Nullable
   private String az;
   private MinecraftServer.a aA;
   private final ewg aB;
   private final ame aC;
   protected final fad j;
   private final dbv aD;
   private dzd aE;
   private int aF;
   private volatile boolean aG;
   private static final AtomicReference<RuntimeException> aH = new AtomicReference<>();
   private final amg aI = new amg();
   private final DiscontinuousFrame aJ;

   public static <S extends MinecraftServer> S a(Function<Thread, S> $$0) {
      AtomicReference<S> $$1 = new AtomicReference<>();
      Thread $$2 = new Thread(() -> $$1.get().y(), "Server thread");
      $$2.setUncaughtExceptionHandler(($$0x, $$1x) -> l.error("Uncaught exception in server thread", $$1x));
      if (Runtime.getRuntime().availableProcessors() > 4) {
         $$2.setPriority(8);
      }

      S $$3 = (S)$$0.apply($$2);
      $$1.set($$3);
      $$2.start();
      return $$3;
   }

   public MinecraftServer(Thread $$0, ezx.c $$1, aur $$2, amj $$3, Proxy $$4, DataFixer $$5, amf $$6, asf $$7) {
      super("Server");
      this.O = $$3.c();
      this.j = $$3.d();
      if (!this.O.a().f(mi.bq).e(efe.b)) {
         throw new IllegalStateException("Missing Overworld dimension data");
      } else {
         this.h = $$4;
         this.ar = $$2;
         this.aA = new MinecraftServer.a($$3.a(), $$3.b());
         this.i = $$6;
         if ($$6.f() != null) {
            $$6.f().a(this);
         }

         this.G = new asw(this);
         this.aC = new ame(this);
         this.H = $$7;
         this.f = $$1;
         this.g = $$1.g();
         this.L = $$5;
         this.av = new alz(this, this.aA.b.a());
         jh<dne> $$8 = this.O.a().f(mi.i).a(this.j.K());
         this.aB = new ewg($$3.a(), $$1, $$5, $$8);
         this.aj = $$0;
         this.ay = ag.h();
         this.aD = dbv.a(this.j.K());
         this.aA.b.c().a(this.j.K());
         this.aE = dzd.a(this.O.a(), this.j.K());
         this.aJ = TracyClient.createDiscontinuousFrame("Server Tick");
      }
   }

   private void a(ezr $$0) {
      $$0.a(amd.a);
   }

   protected abstract boolean e() throws IOException;

   protected void u_() {
      if (!brl.f.c()) {
      }

      boolean $$0 = false;
      bro $$1 = brl.f.e();
      this.j.a(this.getServerModName(), this.Q().a());
      ase $$2 = this.H.create(this.j.o().d(djv.ac));
      this.a($$2);
      this.t();
      this.b($$2);
      if ($$1 != null) {
         $$1.finish(true);
      }

      if ($$0) {
         try {
            brl.f.b();
         } catch (Throwable var5) {
            l.warn("Failed to stop JFR profiling", var5);
         }
      }
   }

   protected void t() {
   }

   protected void a(ase $$0) {
      fac $$1 = this.j.I();
      boolean $$2 = this.j.A();
      jt<efe> $$3 = this.O.a().f(mi.bq);
      eid $$4 = this.j.y();
      long $$5 = $$4.c();
      long $$6 = dle.a($$5);
      List<djl> $$7 = ImmutableList.of(new ehr(), new ehq(), new crh(), new ciw(), new crs($$1));
      efe $$8 = $$3.c(efe.b);
      aru $$9 = new aru(this, this.ay, this.f, $$1, djz.i, $$8, $$0, $$2, $$6, $$7, true, null);
      this.P.put(djz.i, $$9);
      ezr $$10 = $$9.w();
      this.a($$10);
      this.at = new ezo($$10);
      ecy $$11 = $$9.E_();
      if (!$$1.n()) {
         try {
            a($$9, $$1, $$4.e(), $$2);
            $$1.c(true);
            if ($$2) {
               this.a(this.j);
            }
         } catch (Throwable var23) {
            p $$13 = p.a(var23, "Exception initializing level");

            try {
               $$9.a($$13);
            } catch (Throwable var22) {
            }

            throw new aa($$13);
         }

         $$1.c(true);
      }

      this.ag().a($$9);
      if (this.j.E() != null) {
         this.aM().a(this.j.E(), this.ba());
      }

      buy $$14 = $$9.N();

      for (Entry<alj<efe>, efe> $$15 : $$3.k()) {
         alj<efe> $$16 = $$15.getKey();
         if ($$16 != efe.b) {
            alj<djz> $$17 = alj.a(mi.bp, $$16.a());
            ezq $$18 = new ezq(this.j, $$1);
            aru $$19 = new aru(this, this.ay, this.f, $$18, $$17, $$15.getValue(), $$0, $$2, $$6, ImmutableList.of(), false, $$14);
            $$11.a(new ecw.a($$19.E_()));
            this.P.put($$17, $$19);
         }
      }

      $$11.a($$1.p());
   }

   private static void a(aru $$0, fac $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         $$1.a(iw.c.b(80), 0.0F);
      } else {
         arr $$4 = $$0.m();
         dje $$5 = new dje($$4.i().b().a());
         int $$6 = $$4.g().a($$0);
         if ($$6 < $$0.K_()) {
            iw $$7 = $$5.l();
            $$6 = $$0.a(ehf.a.b, $$7.u() + 8, $$7.w() + 8);
         }

         $$1.a($$5.l().b(8, $$6, 8), 0.0F);
         int $$8 = 0;
         int $$9 = 0;
         int $$10 = 0;
         int $$11 = -1;

         for (int $$12 = 0; $$12 < azq.h(11); $$12++) {
            if ($$8 >= -5 && $$8 <= 5 && $$9 >= -5 && $$9 <= 5) {
               iw $$13 = aro.a($$0, new dje($$5.h + $$8, $$5.i + $$9));
               if ($$13 != null) {
                  $$1.a($$13, 0.0F);
                  break;
               }
            }

            if ($$8 == $$9 || $$8 < 0 && $$8 == -$$9 || $$8 > 0 && $$8 == 1 - $$9) {
               int $$14 = $$10;
               $$10 = -$$11;
               $$11 = $$14;
            }

            $$8 += $$10;
            $$9 += $$11;
         }

         if ($$2) {
            $$0.J_().a(mi.aL).flatMap($$0x -> $$0x.a(rk.m)).ifPresent($$3x -> ((ejx)$$3x.a()).a($$0, $$4.g(), $$0.A, $$1.a()));
         }
      }
   }

   private void a(fad $$0) {
      $$0.a(buq.a);
      $$0.d(true);
      fac $$1 = $$0.I();
      $$1.b(false);
      $$1.a(false);
      $$1.a(1000000000);
      $$1.b(6000L);
      $$1.a(djw.d);
   }

   private void b(ase $$0) {
      aru $$1 = this.J();
      l.info("Preparing start region for dimension {}", $$1.aj().a());
      iw $$2 = $$1.aa();
      $$0.a(new dje($$2));
      arr $$3 = $$1.m();
      this.an = ag.d();
      $$1.a($$2, $$1.ab());
      int $$4 = this.aL().d(djv.ac);
      int $$5 = $$4 > 0 ? azq.h(ase.a($$4)) : 0;

      while ($$3.b() < $$5) {
         this.an = ag.d() + t;
         this.w_();
      }

      this.an = ag.d() + t;
      this.w_();

      for (aru $$6 : this.P.values()) {
         dkw $$7 = $$6.w().b(dkw.b);
         if ($$7 != null) {
            $$7.a();
         }
      }

      this.an = ag.d() + t;
      this.w_();
      $$0.b();
      this.bH();
   }

   public djw u() {
      return this.j.k();
   }

   public boolean v_() {
      return this.j.l();
   }

   public abstract int k();

   public abstract int l();

   public abstract boolean m();

   public boolean a(boolean $$0, boolean $$1, boolean $$2) {
      boolean $$3 = false;

      for (aru $$4 : this.L()) {
         if (!$$0) {
            l.info("Saving chunks for level '{}'/{}", $$4, $$4.aj().a());
         }

         $$4.a(null, $$1, $$4.e && !$$2);
         $$3 = true;
      }

      aru $$5 = this.J();
      fac $$6 = this.j.I();
      $$6.a($$5.E_().t());
      this.j.a(this.aM().a(this.ba()));
      this.f.a(this.ba(), this.j, this.ag().r());
      if ($$1) {
         for (aru $$7 : this.L()) {
            l.info("ThreadedAnvilChunkStorage ({}): All chunks are saved", $$7.m().a.n());
         }

         l.info("ThreadedAnvilChunkStorage: All dimensions are saved");
      }

      return $$3;
   }

   public boolean b(boolean $$0, boolean $$1, boolean $$2) {
      boolean var4;
      try {
         this.aG = true;
         this.ag().h();
         var4 = this.a($$0, $$1, $$2);
      } finally {
         this.aG = false;
      }

      return var4;
   }

   @Override
   public void close() {
      this.v();
   }

   public void v() {
      if (this.A.e()) {
         this.aW();
      }

      l.info("Stopping server");
      this.ah().b();
      this.aG = true;
      if (this.Q != null) {
         l.info("Saving players");
         this.Q.h();
         this.Q.s();
      }

      l.info("Saving worlds");

      for (aru $$0 : this.L()) {
         if ($$0 != null) {
            $$0.e = false;
         }
      }

      while (this.P.values().stream().anyMatch($$0x -> $$0x.m().a.e())) {
         this.an = ag.d() + bau.b;

         for (aru $$1 : this.L()) {
            $$1.m().p();
            $$1.m().a(() -> true, false);
         }

         this.w_();
      }

      this.a(false, true, false);

      for (aru $$2 : this.L()) {
         if ($$2 != null) {
            try {
               $$2.close();
            } catch (IOException var5) {
               l.error("Exception closing the level", var5);
            }
         }
      }

      this.aG = false;
      this.aA.close();

      try {
         this.f.close();
      } catch (IOException var4) {
         l.error("Failed to unlock level {}", this.f.f(), var4);
      }
   }

   public String w() {
      return this.M;
   }

   public void a_(String $$0) {
      this.M = $$0;
   }

   public boolean x() {
      return this.R;
   }

   public void a(boolean $$0) {
      this.R = false;
      if ($$0) {
         try {
            this.aj.join();
         } catch (InterruptedException var3) {
            l.error("Error while shutting down", var3);
         }
      }
   }

   protected void y() {
      try {
         if (!this.e()) {
            throw new IllegalStateException("Failed to initialize server");
         }

         this.an = ag.d();
         this.J = this.bC().orElse(null);
         this.I = this.bF();

         while (this.R) {
            long $$0;
            if (!this.E() && this.aC.a() && this.aC.d()) {
               $$0 = 0L;
               this.an = ag.d();
               this.ah = this.an;
            } else {
               $$0 = this.aC.h();
               long $$2 = ag.d() - this.an;
               if ($$2 > o + 20L * $$0 && this.an - this.ah >= q + 100L * $$0) {
                  long $$3 = $$2 / $$0;
                  l.warn("Can't keep up! Is the server overloaded? Running {}ms or {} ticks behind", $$2 / bau.b, $$3);
                  this.an += $$3 * $$0;
                  this.ah = this.an;
               }
            }

            boolean $$4 = $$0 == 0L;
            if (this.F) {
               this.F = false;
               this.E = new MinecraftServer.c(ag.d(), this.T);
            }

            this.an += $$0;

            try (brc.a $$5 = brc.a(this.bI())) {
               brd $$6 = brc.a();
               $$6.a("tick");
               this.aJ.start();
               this.a($$4 ? () -> false : this::bu);
               this.aJ.end();
               $$6.b("nextTickWait");
               this.aq = true;
               this.ap = Math.max(ag.d() + $$0, this.an);
               this.bs();
               this.w_();
               this.bt();
               if ($$4) {
                  this.aC.e();
               }

               $$6.c();
               this.br();
            } finally {
               this.aS();
            }

            this.ag = true;
            brl.f.a(this.ax);
         }
      } catch (Throwable var69) {
         l.error("Encountered an unexpected exception", var69);
         p $$9 = b(var69);
         this.b($$9.f());
         Path $$10 = this.D().resolve("crash-reports").resolve("crash-" + ag.f() + "-server.txt");
         if ($$9.a($$10, z.a)) {
            l.error("This crash report has been saved to: {}", $$10.toAbsolutePath());
         } else {
            l.error("We were unable to save this crash report to disk.");
         }

         this.a($$9);
      } finally {
         try {
            this.S = true;
            this.v();
         } catch (Throwable var64) {
            l.error("Exception stopping the server", var64);
         } finally {
            if (this.i.f() != null) {
               this.i.f().a();
            }

            this.i();
         }
      }
   }

   private void br() {
      long $$0 = ag.d();
      if (this.g()) {
         this.f().a($$0 - this.ak);
      }

      this.ak = $$0;
   }

   private void bs() {
      if (this.g()) {
         this.al = ag.d();
         this.am = 0L;
      }
   }

   private void bt() {
      if (this.g()) {
         bph $$0 = this.f();
         $$0.a(ag.d() - this.al - this.am, bpj.c.ordinal());
         $$0.a(this.am, bpj.d.ordinal());
      }
   }

   private static p b(Throwable $$0) {
      aa $$1 = null;

      for (Throwable $$2 = $$0; $$2 != null; $$2 = $$2.getCause()) {
         if ($$2 instanceof aa $$3) {
            $$1 = $$3;
         }
      }

      p $$4;
      if ($$1 != null) {
         $$4 = $$1.a();
         if ($$1 != $$0) {
            $$4.a("Wrapped in").a("Wrapping exception", $$0);
         }
      } else {
         $$4 = new p("Exception in server tick loop", $$0);
      }

      return $$4;
   }

   private boolean bu() {
      return this.bB() || ag.d() < (this.aq ? this.ap : this.an);
   }

   public static boolean z() {
      RuntimeException $$0 = aH.get();
      if ($$0 != null) {
         throw $$0;
      } else {
         return true;
      }
   }

   public static void a(RuntimeException $$0) {
      aH.compareAndSet(null, $$0);
   }

   @Override
   public void b(BooleanSupplier $$0) {
      super.b(() -> z() && $$0.getAsBoolean());
   }

   protected void w_() {
      this.bA();
      this.ao = true;

      try {
         this.b((BooleanSupplier)(() -> !this.bu()));
      } finally {
         this.ao = false;
      }
   }

   @Override
   public void A() {
      boolean $$0 = this.g();
      long $$1 = $$0 ? ag.d() : 0L;
      long $$2 = this.ao ? this.an - ag.d() : 100000L;
      LockSupport.parkNanos("waiting for tasks", $$2);
      if ($$0) {
         this.am = this.am + (ag.d() - $$1);
      }
   }

   public amh a(Runnable $$0) {
      return new amh(this.T, $$0);
   }

   protected boolean a(amh $$0) {
      return $$0.a() + 3 < this.T || this.bu();
   }

   @Override
   public boolean B() {
      boolean $$0 = this.bv();
      this.aq = $$0;
      return $$0;
   }

   private boolean bv() {
      if (super.B()) {
         return true;
      } else {
         if (this.aC.a() || this.bu()) {
            for (aru $$0 : this.L()) {
               if ($$0.m().d()) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   protected void b(amh $$0) {
      brc.a().f("runTask");
      super.d($$0);
   }

   private Optional<akh.a> bC() {
      Optional<Path> $$0 = Optional.of(this.c("server-icon.png"))
         .filter($$0x -> Files.isRegularFile($$0x))
         .or(() -> this.f.j().filter($$0x -> Files.isRegularFile($$0x)));
      return $$0.flatMap($$0x -> {
         try {
            BufferedImage $$1 = ImageIO.read($$0x.toFile());
            Preconditions.checkState($$1.getWidth() == 64, "Must be 64 pixels wide");
            Preconditions.checkState($$1.getHeight() == 64, "Must be 64 pixels high");
            ByteArrayOutputStream $$2 = new ByteArrayOutputStream();
            ImageIO.write($$1, "PNG", $$2);
            return Optional.of(new akh.a($$2.toByteArray()));
         } catch (Exception var3) {
            l.error("Couldn't load server icon", var3);
            return Optional.empty();
         }
      });
   }

   public Optional<Path> C() {
      return this.f.j();
   }

   public Path D() {
      return Path.of("");
   }

   public void a(p $$0) {
   }

   public void i() {
   }

   public boolean E() {
      return false;
   }

   public void a(BooleanSupplier $$0) {
      long $$1 = ag.d();
      int $$2 = this.bq() * 20;
      if ($$2 > 0) {
         if (this.Q.m() == 0 && !this.aC.a()) {
            this.aF++;
         } else {
            this.aF = 0;
         }

         if (this.aF >= $$2) {
            if (this.aF == $$2) {
               l.info("Server empty for {} seconds, pausing", this.bq());
               this.bD();
            }

            this.G();
            return;
         }
      }

      this.T++;
      this.aC.m();
      this.c($$0);
      if ($$1 - this.ai >= s) {
         this.ai = $$1;
         this.I = this.bF();
      }

      this.U--;
      if (this.U <= 0) {
         this.bD();
      }

      brd $$3 = brc.a();
      $$3.a("tallying");
      long $$4 = ag.d() - $$1;
      int $$5 = this.T % 100;
      this.ac = this.ac - this.ab[$$5];
      this.ac += $$4;
      this.ab[$$5] = $$4;
      this.ax = this.ax * 0.8F + (float)$$4 / (float)bau.b * 0.19999999F;
      this.a($$1);
      $$3.c();
   }

   private void bD() {
      this.U = this.bE();
      l.debug("Autosave started");
      brd $$0 = brc.a();
      $$0.a("save");
      this.b(true, false, false);
      $$0.c();
      l.debug("Autosave finished");
   }

   private void a(long $$0) {
      if (this.g()) {
         this.f().a(ag.d() - $$0, bpj.b.ordinal());
      }
   }

   private int bE() {
      float $$1;
      if (this.aC.a()) {
         long $$0 = this.aQ() + 1L;
         $$1 = (float)bau.a / (float)$$0;
      } else {
         $$1 = this.aC.f();
      }

      int $$3 = 300;
      return Math.max(100, (int)($$1 * 300.0F));
   }

   public void F() {
      int $$0 = this.bE();
      if ($$0 < this.U) {
         this.U = $$0;
      }
   }

   protected abstract bph f();

   public abstract boolean g();

   private akh bF() {
      akh.b $$0 = this.bG();
      return new akh(xc.a(this.Z), Optional.of($$0), Optional.of(akh.c.a()), Optional.ofNullable(this.J), this.aA());
   }

   private akh.b bG() {
      List<arv> $$0 = this.Q.t();
      int $$1 = this.O();
      if (this.an()) {
         return new akh.b($$1, $$0.size(), List.of());
      } else {
         int $$2 = Math.min($$0.size(), 12);
         ObjectArrayList<GameProfile> $$3 = new ObjectArrayList($$2);
         int $$4 = azq.a(this.K, 0, $$0.size() - $$2);

         for (int $$5 = 0; $$5 < $$2; $$5++) {
            arv $$6 = $$0.get($$4 + $$5);
            $$3.add($$6.Y() ? $$6.gi() : e);
         }

         ag.c($$3, this.K);
         return new akh.b($$1, $$0.size(), $$3);
      }
   }

   protected void c(BooleanSupplier $$0) {
      brd $$1 = brc.a();
      this.ag().t().forEach($$0x -> $$0x.f.f());
      $$1.a("commandFunctions");
      this.aE().b();
      $$1.b("levels");

      for (aru $$2 : this.L()) {
         $$1.a(() -> $$2 + " " + $$2.aj().a());
         if (this.T % 20 == 0) {
            $$1.a("timeSync");
            this.b($$2);
            $$1.c();
         }

         $$1.a("tick");

         try {
            $$2.a($$0);
         } catch (Throwable var7) {
            p $$4 = p.a(var7, "Exception ticking world");
            $$2.a($$4);
            throw new aa($$4);
         }

         $$1.c();
         $$1.c();
      }

      $$1.b("connection");
      this.G();
      $$1.b("players");
      this.Q.d();
      if (this.aC.i()) {
         sz.a.b();
      }

      $$1.b("server gui refresh");

      for (int $$5 = 0; $$5 < this.z.size(); $$5++) {
         this.z.get($$5).run();
      }

      $$1.b("send chunks");

      for (arv $$6 : this.Q.t()) {
         $$6.f.g.a($$6);
         $$6.f.g();
      }

      $$1.c();
   }

   public void G() {
      this.ah().c();
   }

   private void b(aru $$0) {
      this.Q.a(new afv($$0.ae(), $$0.af(), $$0.O().c(djv.m)), $$0.aj());
   }

   public void H() {
      brd $$0 = brc.a();
      $$0.a("timeSync");

      for (aru $$1 : this.L()) {
         this.b($$1);
      }

      $$0.c();
   }

   public boolean a(djz $$0) {
      return true;
   }

   public void b(Runnable $$0) {
      this.z.add($$0);
   }

   protected void b(String $$0) {
      this.az = $$0;
   }

   public boolean I() {
      return !this.aj.isAlive();
   }

   public Path c(String $$0) {
      return this.D().resolve($$0);
   }

   public final aru J() {
      return this.P.get(djz.i);
   }

   @Nullable
   public aru a(alj<djz> $$0) {
      return this.P.get($$0);
   }

   public Set<alj<djz>> K() {
      return this.P.keySet();
   }

   public Iterable<aru> L() {
      return this.P.values();
   }

   @Override
   public String M() {
      return ac.b().c();
   }

   @Override
   public int N() {
      return this.Q.m();
   }

   @Override
   public int O() {
      return this.Q.n();
   }

   public String[] P() {
      return this.Q.e();
   }

   @DontObfuscate
   public String getServerModName() {
      return "vanilla";
   }

   public ae b(ae $$0) {
      $$0.a("Server Running", () -> Boolean.toString(this.R));
      if (this.Q != null) {
         $$0.a("Player Count", () -> this.Q.m() + " / " + this.Q.n() + "; " + this.Q.t());
      }

      $$0.a("Active Data Packs", () -> aur.a(this.ar.g()));
      $$0.a("Available Data Packs", () -> aur.a(this.ar.d()));
      $$0.a("Enabled Feature Flags", () -> cvl.e.b(this.j.K()).stream().map(alk::toString).collect(Collectors.joining(", ")));
      $$0.a("World Generation", () -> this.j.B().toString());
      $$0.a("World Seed", () -> String.valueOf(this.j.y().c()));
      $$0.a("Suppressed Exceptions", this.aI::a);
      if (this.az != null) {
         $$0.a("Server Id", () -> this.az);
      }

      return this.a($$0);
   }

   public abstract ae a(ae var1);

   public azp Q() {
      return azp.a("vanilla", this::getServerModName, "Server", MinecraftServer.class);
   }

   @Override
   public void a(xc $$0) {
      l.info($$0.getString());
   }

   public KeyPair R() {
      return this.ad;
   }

   public int S() {
      return this.N;
   }

   public void a(int $$0) {
      this.N = $$0;
   }

   @Nullable
   public GameProfile T() {
      return this.ae;
   }

   public void b(@Nullable GameProfile $$0) {
      this.ae = $$0;
   }

   public boolean U() {
      return this.ae != null;
   }

   protected void V() {
      l.info("Generating keypair");

      try {
         this.ad = ayn.b();
      } catch (ayo var2) {
         throw new IllegalStateException("Failed to generate key pair", var2);
      }
   }

   public void a(buq $$0, boolean $$1) {
      if ($$1 || !this.j.r()) {
         this.j.a(this.j.l() ? buq.d : $$0);
         this.bH();
         this.ag().t().forEach(this::c);
      }
   }

   public int b(int $$0) {
      return $$0;
   }

   private void bH() {
      for (aru $$0 : this.L()) {
         $$0.a(this.W());
      }
   }

   public void b(boolean $$0) {
      this.j.d($$0);
      this.ag().t().forEach(this::c);
   }

   private void c(arv $$0) {
      ezt $$1 = $$0.dV().C_();
      $$0.f.b(new ack($$1.q(), $$1.r()));
   }

   public boolean W() {
      return this.j.q() != buq.a;
   }

   public boolean X() {
      return this.af;
   }

   public void c(boolean $$0) {
      this.af = $$0;
   }

   public Optional<MinecraftServer.b> Y() {
      return Optional.empty();
   }

   public boolean Z() {
      return this.Y().filter(MinecraftServer.b::d).isPresent();
   }

   public abstract boolean n();

   public abstract int o();

   public boolean aa() {
      return this.V;
   }

   public void d(boolean $$0) {
      this.V = $$0;
   }

   public boolean ab() {
      return this.W;
   }

   public void e(boolean $$0) {
      this.W = $$0;
   }

   public abstract boolean p();

   public boolean ac() {
      return this.X;
   }

   public void f(boolean $$0) {
      this.X = $$0;
   }

   public boolean ad() {
      return this.Y;
   }

   public void g(boolean $$0) {
      this.Y = $$0;
   }

   public abstract boolean q();

   @Override
   public String ae() {
      return this.Z;
   }

   public void d(String $$0) {
      this.Z = $$0;
   }

   public boolean af() {
      return this.S;
   }

   public avu ag() {
      return this.Q;
   }

   public void a(avu $$0) {
      this.Q = $$0;
   }

   public abstract boolean r();

   public void a(djw $$0) {
      this.j.a($$0);
   }

   public asw ah() {
      return this.G;
   }

   public boolean ai() {
      return this.ag;
   }

   public boolean aj() {
      return false;
   }

   public boolean a(@Nullable djw $$0, boolean $$1, int $$2) {
      return false;
   }

   public int ak() {
      return this.T;
   }

   public int al() {
      return 16;
   }

   public boolean a(aru $$0, iw $$1, crz $$2) {
      return false;
   }

   public boolean am() {
      return true;
   }

   public boolean an() {
      return false;
   }

   public Proxy ao() {
      return this.h;
   }

   public int ap() {
      return this.aa;
   }

   public void c(int $$0) {
      this.aa = $$0;
   }

   public MinecraftSessionService aq() {
      return this.i.c();
   }

   @Nullable
   public baf ar() {
      return this.i.a();
   }

   public GameProfileRepository as() {
      return this.i.e();
   }

   @Nullable
   public avq at() {
      return this.i.f();
   }

   @Nullable
   public akh au() {
      return this.I;
   }

   public void av() {
      this.ai = 0L;
   }

   public int aw() {
      return 29999984;
   }

   @Override
   public boolean ax() {
      return super.ax() && !this.af();
   }

   @Override
   public void c(Runnable $$0) {
      if (this.af()) {
         throw new RejectedExecutionException("Server already shutting down");
      } else {
         super.c($$0);
      }
   }

   @Override
   public Thread ay() {
      return this.aj;
   }

   public int az() {
      return 256;
   }

   public boolean aA() {
      return false;
   }

   public long aB() {
      return this.an;
   }

   public DataFixer aC() {
      return this.L;
   }

   public int a(@Nullable aru $$0) {
      return $$0 != null ? $$0.O().d(djv.t) : 10;
   }

   public alx aD() {
      return this.aA.b.e();
   }

   public alz aE() {
      return this.av;
   }

   public CompletableFuture<Void> a(Collection<String> $$0) {
      CompletableFuture<Void> $$1 = CompletableFuture.<ImmutableList>supplyAsync(
            () -> $$0.stream().map(this.ar::c).filter(Objects::nonNull).map(auo::f).collect(ImmutableList.toImmutableList()), this
         )
         .thenCompose($$0x -> {
            auw $$1x = new ava(atv.b, $$0x);
            List<jt.a<?>> $$2 = axw.a($$1x, this.O.a());
            return alv.a($$1x, this.O, $$2, this.j.K(), this.n() ? el.a.b : el.a.c, this.l(), this.ay, this).whenComplete(($$1xx, $$2x) -> {
               if ($$2x != null) {
                  $$1x.close();
               }
            }).thenApply($$1xx -> new MinecraftServer.a($$1x, $$1xx));
         })
         .thenAcceptAsync($$1x -> {
            this.aA.close();
            this.aA = $$1x;
            this.ar.b($$0);
            dkx $$2 = new dkx(a(this.ar, true), this.j.K());
            this.j.a($$2);
            this.aA.b.g();
            this.aA.b.c().a(this.j.K());
            this.ag().h();
            this.ag().u();
            this.av.a(this.aA.b.a());
            this.aB.a(this.aA.a);
            this.aE = dzd.a(this.O.a(), this.j.K());
         }, this);
      if (this.bx()) {
         this.b($$1::isDone);
      }

      return $$1;
   }

   public static dkx a(aur $$0, dkx $$1, boolean $$2, boolean $$3) {
      djm $$4 = $$1.a();
      cvj $$5 = $$2 ? cvj.a() : $$1.b();
      cvj $$6 = $$2 ? cvl.e.a() : $$1.b();
      $$0.a();
      if ($$3) {
         return a($$0, List.of("vanilla"), $$5, false);
      } else {
         Set<String> $$7 = Sets.newLinkedHashSet();

         for (String $$8 : $$4.a()) {
            if ($$0.d($$8)) {
               $$7.add($$8);
            } else {
               l.warn("Missing data pack {}", $$8);
            }
         }

         for (auo $$9 : $$0.d()) {
            String $$10 = $$9.g();
            if (!$$4.b().contains($$10)) {
               cvj $$11 = $$9.e();
               boolean $$12 = $$7.contains($$10);
               if (!$$12 && $$9.l().a()) {
                  if ($$11.a($$6)) {
                     l.info("Found new data pack {}, loading it automatically", $$10);
                     $$7.add($$10);
                  } else {
                     l.info("Found new data pack {}, but can't load it due to missing features {}", $$10, cvl.a($$6, $$11));
                  }
               }

               if ($$12 && !$$11.a($$6)) {
                  l.warn("Pack {} requires features {} that are not enabled for this world, disabling pack.", $$10, cvl.a($$6, $$11));
                  $$7.remove($$10);
               }
            }
         }

         if ($$7.isEmpty()) {
            l.info("No datapacks selected, forcing vanilla");
            $$7.add("vanilla");
         }

         return a($$0, $$7, $$5, true);
      }
   }

   private static dkx a(aur $$0, Collection<String> $$1, cvj $$2, boolean $$3) {
      $$0.b($$1);
      a($$0, $$2);
      djm $$4 = a($$0, $$3);
      cvj $$5 = $$0.f().c($$2);
      return new dkx($$4, $$5);
   }

   private static void a(aur $$0, cvj $$1) {
      cvj $$2 = $$0.f();
      cvj $$3 = $$1.d($$2);
      if (!$$3.b()) {
         Set<String> $$4 = new ObjectArraySet($$0.e());

         for (auo $$5 : $$0.d()) {
            if ($$3.b()) {
               break;
            }

            if ($$5.l() == aus.d) {
               String $$6 = $$5.g();
               cvj $$7 = $$5.e();
               if (!$$7.b() && $$7.b($$3) && $$7.a($$1)) {
                  if (!$$4.add($$6)) {
                     throw new IllegalStateException("Tried to force '" + $$6 + "', but it was already enabled");
                  }

                  l.info("Found feature pack ('{}') for requested feature, forcing to enabled", $$6);
                  $$3 = $$3.d($$7);
               }
            }
         }

         $$0.b($$4);
      }
   }

   private static djm a(aur $$0, boolean $$1) {
      Collection<String> $$2 = $$0.e();
      List<String> $$3 = ImmutableList.copyOf($$2);
      List<String> $$4 = $$1 ? $$0.c().stream().filter($$1x -> !$$2.contains($$1x)).toList() : List.of();
      return new djm($$3, $$4);
   }

   public void a(ek $$0) {
      if (this.aN()) {
         avu $$1 = $$0.l().ag();
         awc $$2 = $$1.i();

         for (arv $$4 : Lists.newArrayList($$1.t())) {
            if (!$$2.a($$4.gi())) {
               $$4.f.a(xc.c("multiplayer.disconnect.not_whitelisted"));
            }
         }
      }
   }

   public aur aF() {
      return this.ar;
   }

   public el aG() {
      return this.aA.b.d();
   }

   public ek aH() {
      aru $$0 = this.J();
      return new ek(this, $$0 == null ? ffs.c : ffs.a($$0.aa()), ffr.a, $$0, 4, "Server", xc.b("Server"), this, null);
   }

   @Override
   public boolean x_() {
      return true;
   }

   @Override
   public boolean y_() {
      return true;
   }

   @Override
   public abstract boolean c();

   public dey aI() {
      return this.aA.b.c();
   }

   public amd aJ() {
      return this.as;
   }

   public ezo aK() {
      if (this.at == null) {
         throw new NullPointerException("Called before server init");
      } else {
         return this.at;
      }
   }

   public djv aL() {
      return this.J().O();
   }

   public amn aM() {
      return this.au;
   }

   public boolean aN() {
      return this.aw;
   }

   public void h(boolean $$0) {
      this.aw = $$0;
   }

   public float aO() {
      return this.ax;
   }

   public ame aP() {
      return this.aC;
   }

   public long aQ() {
      return this.ac / (long)Math.min(100, Math.max(this.T, 1));
   }

   public long[] aR() {
      return this.ab;
   }

   public int c(GameProfile $$0) {
      if (this.ag().f($$0)) {
         avw $$1 = this.ag().k().b($$0);
         if ($$1 != null) {
            return $$1.a();
         } else if (this.a($$0)) {
            return 4;
         } else if (this.U()) {
            return this.ag().v() ? 4 : 0;
         } else {
            return this.k();
         }
      } else {
         return 0;
      }
   }

   public abstract boolean a(GameProfile var1);

   public void a(Path $$0) throws IOException {
   }

   private void b(Path $$0) {
      Path $$1 = $$0.resolve("levels");

      try {
         for (Entry<alj<djz>, aru> $$2 : this.P.entrySet()) {
            alk $$3 = $$2.getKey().a();
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
         $$1.write(String.format(Locale.ROOT, "pending_tasks: %d\n", this.by()));
         $$1.write(String.format(Locale.ROOT, "average_tick_time: %f\n", this.aO()));
         $$1.write(String.format(Locale.ROOT, "tick_times: %s\n", Arrays.toString(this.ab)));
         $$1.write(String.format(Locale.ROOT, "queue: %s\n", ag.h()));
      }
   }

   private void d(Path $$0) throws IOException {
      try (Writer $$1 = Files.newBufferedWriter($$0)) {
         final List<String> $$2 = Lists.newArrayList();
         final djv $$3 = this.aL();
         $$3.a(new djv.c() {
            @Override
            public <T extends djv.g<T>> void a(djv.e<T> $$0, djv.f<T> $$1) {
               $$2.add(String.format(Locale.ROOT, "%s=%s\n", $$0.a(), $$3.b($$0)));
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
         List<azr.a> $$2;
         try {
            $$2 = Lists.newArrayList(azr.a());
         } catch (Throwable var7) {
            l.warn("Failed to list native modules", var7);
            return;
         }

         $$2.sort(Comparator.comparing($$0x -> $$0x.a));

         for (azr.a $$5 : $$2) {
            $$1.write($$5.toString());
            $$1.write(10);
         }
      }
   }

   private brd bI() {
      if (this.D) {
         this.A = bss.a(new bsw(ag.c, this.n()), ag.c, ag.i(), new bsy("server"), this.B, $$0 -> {
            this.h(() -> this.b($$0.resolve("server")));
            this.C.accept($$0);
         });
         this.D = false;
      }

      this.A.c();
      return brg.a(this.A.f(), brg.a("Server"));
   }

   public void aS() {
      this.A.d();
   }

   public boolean aT() {
      return this.A.e();
   }

   public void a(Consumer<brb> $$0, Consumer<Path> $$1) {
      this.B = $$1x -> {
         this.aU();
         $$0.accept($$1x);
      };
      this.C = $$1;
      this.D = true;
   }

   public void aU() {
      this.A = bst.a;
   }

   public void aV() {
      this.A.a();
   }

   public void aW() {
      this.A.b();
   }

   public Path a(ezv $$0) {
      return this.f.a($$0);
   }

   public boolean aX() {
      return true;
   }

   public ewg aY() {
      return this.aB;
   }

   public fad aZ() {
      return this.j;
   }

   public ju.b ba() {
      return this.O.a();
   }

   public jn<alt> bb() {
      return this.O;
   }

   public alu.a bc() {
      return this.aA.b.b();
   }

   public atd a(arv $$0) {
      return atd.e;
   }

   public arw b(arv $$0) {
      return (arw)(this.X() ? new arg($$0) : new arw($$0));
   }

   @Nullable
   public djw bd() {
      return null;
   }

   public avh be() {
      return this.aA.a;
   }

   public boolean bf() {
      return this.aG;
   }

   public boolean bg() {
      return this.F || this.E != null;
   }

   public void bh() {
      this.F = true;
   }

   public brb bi() {
      if (this.E == null) {
         return bqx.a;
      } else {
         brb $$0 = this.E.a(ag.d(), this.T);
         this.E = null;
         return $$0;
      }
   }

   public int bj() {
      return 1000000;
   }

   public void a(xc $$0, wy.a $$1, @Nullable String $$2) {
      String $$3 = $$1.a($$0).getString();
      if ($$2 != null) {
         l.info("[{}] {}", $$2, $$3);
      } else {
         l.info("{}", $$3);
      }
   }

   public wx bk() {
      return wx.a;
   }

   public boolean bl() {
      return true;
   }

   public void a(arv $$0, bpf $$1) {
   }

   public boolean bm() {
      return false;
   }

   private void a(p $$0, dje $$1, eew $$2) {
      ag.i().execute(() -> {
         try {
            Path $$3 = this.c("debug");
            w.c($$3);
            String $$4 = w.a($$2.a());
            Path $$5 = $$3.resolve("chunk-" + $$4 + "-" + ag.f() + "-server.txt");
            FileStore $$6 = Files.getFileStore($$3);
            long $$7 = $$6.getUsableSpace();
            if ($$7 < 8192L) {
               l.warn("Not storing chunk IO report due to low space on drive {}", $$6.name());
               return;
            }

            q $$8 = $$0.a("Chunk Info");
            $$8.a("Level", $$2::a);
            $$8.a("Dimension", () -> $$2.b().a().toString());
            $$8.a("Storage", $$2::c);
            $$8.a("Position", $$1::toString);
            $$0.a($$5, z.e);
            l.info("Saved details to {}", $$0.e());
         } catch (Exception var11) {
            l.warn("Failed to store chunk IO exception", var11);
         }
      });
   }

   @Override
   public void a(Throwable $$0, eew $$1, dje $$2) {
      l.error("Failed to load chunk {},{}", new Object[]{$$2.h, $$2.i, $$0});
      this.aI.a("chunk/load", $$0);
      this.a(p.a($$0, "Chunk load failure"), $$2, $$1);
   }

   @Override
   public void b(Throwable $$0, eew $$1, dje $$2) {
      l.error("Failed to save chunk {},{}", new Object[]{$$2.h, $$2.i, $$0});
      this.aI.a("chunk/save", $$0);
      this.a(p.a($$0, "Chunk save failure"), $$2, $$1);
   }

   public void a(Throwable $$0, zl<?> $$1) {
      this.aI.a("packet/" + $$1.toString(), $$0);
   }

   public dbv bn() {
      return this.aD;
   }

   public dzd bo() {
      return this.aE;
   }

   public amc bp() {
      return amc.a;
   }

   protected int bq() {
      return 0;
   }

   static record a(auw a, alv b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.close();
      }
   }

   public static record b(UUID a, String b, String c, boolean d, @Nullable xc e) {
   }

   static class c {
      final long a;
      final int b;

      c(long $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      brb a(final long $$0, final int $$1) {
         return new brb() {
            @Override
            public List<brf> a(String $$0x) {
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
