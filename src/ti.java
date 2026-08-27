import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record ti(tj j, tj k) {
   public static final Codec<ti> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(tj.a.fieldOf("chat").forGetter(ti::a), tj.a.fieldOf("narration").forGetter(ti::b)).apply($$0, ti::new)
   );
   public static final tj b = tj.a("chat.type.text");
   public static final aew<ti> c = a("chat");
   public static final aew<ti> d = a("say_command");
   public static final aew<ti> e = a("msg_command_incoming");
   public static final aew<ti> f = a("msg_command_outgoing");
   public static final aew<ti> g = a("team_msg_command_incoming");
   public static final aew<ti> h = a("team_msg_command_outgoing");
   public static final aew<ti> i = a("emote_command");

   private static aew<ti> a(String $$0) {
      return aew.a(je.aq, new aex($$0));
   }

   public static void a(nt<ti> $$0) {
      $$0.a(c, new ti(b, tj.a("chat.type.text.narrate")));
      $$0.a(d, new ti(tj.a("chat.type.announcement"), tj.a("chat.type.text.narrate")));
      $$0.a(e, new ti(tj.b("commands.message.display.incoming"), tj.a("chat.type.text.narrate")));
      $$0.a(f, new ti(tj.c("commands.message.display.outgoing"), tj.a("chat.type.text.narrate")));
      $$0.a(g, new ti(tj.d("chat.type.team.text"), tj.a("chat.type.text.narrate")));
      $$0.a(h, new ti(tj.d("chat.type.team.sent"), tj.a("chat.type.text.narrate")));
      $$0.a(i, new ti(tj.a("chat.type.emote"), tj.a("chat.type.emote")));
   }

   public static ti.a a(aew<ti> $$0, biq $$1) {
      return a($$0, $$1.dL().G_(), $$1.N_());
   }

   public static ti.a a(aew<ti> $$0, dt $$1) {
      return a($$0, $$1.v(), $$1.b());
   }

   public static ti.a a(aew<ti> $$0, hu $$1, tm $$2) {
      ht<ti> $$3 = $$1.d(je.aq);
      return $$3.e($$0).a($$2);
   }

   public ti.a a(tm $$0) {
      return new ti.a(this, $$0);
   }

   public tj a() {
      return this.j;
   }

   public tj b() {
      return this.k;
   }

   public static record a(ti a, tm b, @Nullable tm c) {
      a(ti $$0, tm $$1) {
         this($$0, $$1, null);
      }

      public tm a(tm $$0) {
         return this.a.a().a($$0, this);
      }

      public tm b(tm $$0) {
         return this.a.b().a($$0, this);
      }

      public ti.a c(tm $$0) {
         return new ti.a(this.a, this.b, $$0);
      }

      public ti.b a(hu $$0) {
         ht<ti> $$1 = $$0.d(je.aq);
         return new ti.b($$1.a(this.a), this.b, this.c);
      }
   }

   public static record b(int a, tm b, @Nullable tm c) {
      public b(sp $$0) {
         this($$0.m(), $$0.l(), $$0.c(sp::l));
      }

      public void a(sp $$0) {
         $$0.c(this.a);
         $$0.a(this.b);
         $$0.a(this.c, sp::a);
      }

      public Optional<ti.a> a(hu $$0) {
         ht<ti> $$1 = $$0.d(je.aq);
         ti $$2 = $$1.a(this.a);
         return Optional.ofNullable($$2).map($$0x -> new ti.a($$0x, this.b, this.c));
      }
   }
}
